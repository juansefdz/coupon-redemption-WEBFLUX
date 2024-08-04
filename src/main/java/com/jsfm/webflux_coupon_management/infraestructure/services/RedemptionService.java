package com.jsfm.webflux_coupon_management.infraestructure.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsfm.webflux_coupon_management.domain.entities.Redemption;
import com.jsfm.webflux_coupon_management.domain.repositories.RedemptionRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RedemptionService {
    @Autowired
    private RedemptionRepository redemptionRepository;

    public Mono<Redemption> redeemCoupon(Redemption redemption) {
        return redemptionRepository.save(redemption);
    }

    public Flux<Redemption> getUserRedemptions(Long userId) {
        return redemptionRepository.findByUserId(userId);
    }
}