package com.fmmall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author 何翔
 * @since 2022-07-08
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
@TableName("users")
@ApiModel(value = "Users对象", description = "用户 ")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty("密码")
    @TableField("password")
    private String password;

    @ApiModelProperty("昵称")
    @TableField("nickname")
    private String nickname;

    @ApiModelProperty("真实姓名")
    @TableField("realname")
    private String realname;

    @ApiModelProperty("头像")
    @TableField("user_img")
    private String userImg;

    @ApiModelProperty("手机号")
    @TableField("user_mobile")
    private String userMobile;

    @ApiModelProperty("邮箱地址")
    @TableField("user_email")
    private String userEmail;

    @ApiModelProperty("性别 M(男) or F(女)")
    @TableField("user_sex")
    private String userSex;

    @ApiModelProperty("生日")
    @TableField("user_birth")
    private LocalDate userBirth;

    @ApiModelProperty("创建时间")
    @TableField("user_regtime")
    private LocalDateTime userRegtime;

    @ApiModelProperty("更新时间")
    @TableField("user_modtime")
    private LocalDateTime userModtime;


}
