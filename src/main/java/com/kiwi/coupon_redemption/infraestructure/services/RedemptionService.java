package com.kiwi.coupon_redemption.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiwi.coupon_redemption.domain.entities.Redemption;
import com.kiwi.coupon_redemption.domain.repositories.RedemptionRepository;

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