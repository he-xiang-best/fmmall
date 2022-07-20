package com.gulimall.member.feign;

import com.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 何翔
 * @date: 2022/7/20
 * @description:
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/test/member/list")
    public R memberCoupons();

}
