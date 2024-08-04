package com.jsfm.webflux_coupon_management.domain.repositories;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.jsfm.webflux_coupon_management.domain.entities.Coupon;


public interface CouponRepository extends ReactiveCrudRepository<Coupon, Long> {
    
}
