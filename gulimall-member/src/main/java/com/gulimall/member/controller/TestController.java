package com.gulimall.member.controller;

import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.R;
import com.gulimall.member.entity.MemberEntity;
import com.gulimall.member.feign.CouponFeignService;
import com.gulimall.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员
 *
 * @author HE
 * @email 172837855@qq.com
 * @date 2022-07-19 20:44:55
 */
@RestController
@RequestMapping("member/test")
public class TestController {
    @Autowired
    private CouponFeignService couponFeignService;

    /**
     * 列表
     */
    @RequestMapping("/coupons")
        public R list(){
        MemberEntity member = new MemberEntity();
        member.setNickname("张三");
        R data = couponFeignService.memberCoupons();
        return R.ok().put("member", member).put("coupons", data.get("coupons"));
    }


}
