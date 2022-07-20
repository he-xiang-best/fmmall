package com.gulimall.coupon.controller;

import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;
import com.gulimall.coupon.config.PatternProperties;
import com.gulimall.coupon.entity.CouponEntity;
import com.gulimall.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Map;


/**
 * 优惠券信息
 *
 * @author HE
 * @email 172837855@qq.com
 * @date 2022-07-19 20:22:54
 */
@RestController
@RequestMapping("coupon/test")
public class TestController {

    @Autowired
    private CouponService couponService;

    @Autowired
    private PatternProperties patternProperties;

    /**
     * 列表
     */
    @RequestMapping("/member/list")
        public R memberCoupons(){
        CouponEntity coupon = new CouponEntity();
        coupon.setCouponName("满100减10");
        return R.ok().put("coupons", Arrays.asList(coupon));
    }



    @GetMapping("now")
    public R now(){
        return R.ok().put("now",LocalDateTime.now().format(DateTimeFormatter.ofPattern(patternProperties.getDateformat())));
    }


}
