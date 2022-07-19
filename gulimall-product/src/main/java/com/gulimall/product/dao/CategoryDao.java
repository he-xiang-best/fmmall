package com.gulimall.product.dao;

import com.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author HE
 * @email 172837855@qq.com
 * @date 2022-07-19 12:41:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
