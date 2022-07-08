package com.fmmall.generator;

/*
 * @ClassName CodeGenerator
 * @description: 代码生成器
 * @author: 何翔
 * @Date 2022/7/4 18:50
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.*;

public class CodeGenerator {
    /**
     * TODO 项目名称
     */
    private static final String PROJECT_NAME = "fmmall";
    /**
     * TODO 基础包名
     */
    private static final String PACKAGE_DIR = "/com/"+PROJECT_NAME+"/";
    /**
     * TODO 数据库地址
     */
    private static final String URL = "jdbc:mysql://localhost:3306/db_fmmall?useUnicode=true&characterEncoding =UTF-8&serverTimezone = Asia/Shanghai";
    /**
     * TODO 数据库用户名
     */
    private static final String USERNAME = "root";
    /**
     * TODO 数据库密码
     */
    private static final String PASSWORD = "root";
    /**
     * TODO  作者
     */
    private static final String AUTHOR = "何翔";
    /**
     * 项目路径
     */
    private static final String PARENT_DIR = System.getProperty("user.dir");
    /**
     * xml路径
     */
    private static final String XML_PATH = PARENT_DIR + "/"+PROJECT_NAME+"-mapper/src/main/resources/mapper";
    /**
     * entity路径
     */
    private static final String ENTITY_PATH = PARENT_DIR +"/"+PROJECT_NAME+"-entity/src/main/java"+PACKAGE_DIR+"entity";
    /**
     * mapper路径
     */
    private static final String MAPPER_PATH = PARENT_DIR +"/"+PROJECT_NAME+"-mapper/src/main/java"+PACKAGE_DIR+"mapper";
    /**
     * service路径
     */
    private static final String SERVICE_PATH = PARENT_DIR +"/"+PROJECT_NAME+"-service/src/main/java"+PACKAGE_DIR+"service";
    /**
     * serviceImpl路径
     */
    private static final String SERVICE_IMPL_PATH = PARENT_DIR +"/"+PROJECT_NAME+"-service/src/main/java"+PACKAGE_DIR+"service/impl/";
    /**
     * controller路径
     */
    private static final String CONTROLLER_PATH = PARENT_DIR +"/"+PROJECT_NAME+"-api/src/main/java"+PACKAGE_DIR+"controller";

    public static void main(String[] args) {
        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
                // 全局配置
                .globalConfig(builder -> builder
                        // 设置作者
                        .author(AUTHOR)
                        //开启swagger注解
                        .enableSwagger()
                        .disableOpenDir()
                )
                // 包配置
                .packageConfig(builder -> builder
                        .parent("")
                        .xml("mapper")
                        .entity("com."+PROJECT_NAME+".entity")
                        .mapper("com."+PROJECT_NAME+".mapper")
                        .service("com."+PROJECT_NAME+".service")
                        .serviceImpl("com."+PROJECT_NAME+".service.impl")
                        .controller("com."+PROJECT_NAME+".controller")
                        .pathInfo(getPathInfo())
                )
                // 策略配置
                .strategyConfig((scanner, builder) ->
                        builder.addInclude(getTables(scanner.apply("请输入表名，多个表之间用英文逗号分隔，所有输入all")))
                        // entity
                        .entityBuilder()
                        .fileOverride()
                        .enableChainModel()
                        .fileOverride()
                        .enableLombok()
                        .enableTableFieldAnnotation()
                        //.logicDeleteColumnName("deleted")
                        //.logicDeletePropertyName("deleteFlag")
                        .idType(IdType.AUTO)
                        //.addTableFills(new Column("create_time", FieldFill.INSERT))
                        //.addTableFills(new Property("update_time", FieldFill.INSERT_UPDATE))
                        // controller
                        .controllerBuilder()
                        .fileOverride()
                        .enableRestStyle()
                        .formatFileName("%sController")
                        // service
                        .serviceBuilder()
                        .fileOverride()
                        .superServiceClass(IService.class)
                        .formatServiceFileName("%sService")
                        .formatServiceImplFileName("%sServiceImpl")
                        // mapper
                        .mapperBuilder()
                        .fileOverride()
                        .enableBaseResultMap()
                        .enableBaseColumnList()
                        .superClass(BaseMapper.class)
                        .formatMapperFileName("%sMapper")
                        .formatXmlFileName("%sMapper")
                        //.enableMapperAnnotation()
                )
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();


    }
    /**
     * 获取路径信息map
     * @author 何翔
     */
    private static Map<OutputFile, String> getPathInfo() {
        Map<OutputFile, String> pathInfo = new HashMap<>(5);
        pathInfo.put(OutputFile.entity, ENTITY_PATH);
        pathInfo.put(OutputFile.mapper, MAPPER_PATH);
        pathInfo.put(OutputFile.service, SERVICE_PATH);
        pathInfo.put(OutputFile.serviceImpl, SERVICE_IMPL_PATH);
        pathInfo.put(OutputFile.controller, CONTROLLER_PATH);
        pathInfo.put(OutputFile.xml, XML_PATH);
        return pathInfo;
    }

    // 处理 all 情况
    protected static List<String> getTables (String tables){
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}
