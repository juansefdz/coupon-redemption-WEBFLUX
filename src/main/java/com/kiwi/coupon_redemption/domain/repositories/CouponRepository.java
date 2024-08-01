package com.kiwi.coupon_redemption.domain.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.kiwi.coupon_redemption.domain.entities.Coupon;

public interface CouponRepository extends ReactiveCrudRepository<Coupon, Long> {
    
}
