package com.jsfm.webflux_coupon_management.api.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsfm.webflux_coupon_management.domain.entities.Redemption;
import com.jsfm.webflux_coupon_management.infraestructure.services.RedemptionService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/redemptions")
public class RedemptionController {
    @Autowired
    private RedemptionService redemptionService;

    @PostMapping
    public Mono<Redemption> redeemCoupon(@RequestBody Redemption redemption) {
        return redemptionService.redeemCoupon(redemption);
    }

    @GetMapping("/user/{userId}")
    public Flux<Redemption> getUserRedemptions(@PathVariable Long userId) {
        return redemptionService.getUserRedemptions(userId);
    }
}

