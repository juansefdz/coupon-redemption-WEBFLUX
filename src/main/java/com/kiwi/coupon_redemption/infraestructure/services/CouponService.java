package com.kiwi.coupon_redemption.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiwi.coupon_redemption.domain.entities.Coupon;
import com.kiwi.coupon_redemption.domain.repositories.CouponRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;

    public Mono<Coupon> createCoupon(Coupon coupon) {
        return couponRepository.save(coupon);
    }
    
    public Flux<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }
}