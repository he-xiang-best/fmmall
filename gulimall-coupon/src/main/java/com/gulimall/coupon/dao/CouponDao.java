package com.gulimall.coupon.dao;

import com.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author HE
 * @email 172837855@qq.com
 * @date 2022-07-19 20:22:54
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
