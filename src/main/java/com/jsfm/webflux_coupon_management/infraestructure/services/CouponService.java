package com.jsfm.webflux_coupon_management.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsfm.webflux_coupon_management.domain.entities.Coupon;
import com.jsfm.webflux_coupon_management.domain.repositories.CouponRepository;

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