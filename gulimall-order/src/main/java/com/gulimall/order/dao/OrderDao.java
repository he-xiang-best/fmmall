package com.gulimall.order.dao;

import com.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author HE
 * @email 172837855@qq.com
 * @date 2022-07-19 20:37:49
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
