package com.kiwi.coupon_redemption.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiwi.coupon_redemption.domain.entities.Coupon;
import com.kiwi.coupon_redemption.infraestructure.services.CouponService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/coupons")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @PostMapping
    public Mono<Coupon> createCoupon(@RequestBody Coupon coupon) {
        return couponService.createCoupon(coupon);
    }

    @GetMapping
    public Flux<Coupon> getAllCoupons() {
        return couponService.getAllCoupons();
    }
}