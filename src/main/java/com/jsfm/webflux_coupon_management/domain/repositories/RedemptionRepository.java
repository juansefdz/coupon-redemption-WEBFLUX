package com.jsfm.webflux_coupon_management.domain.repositories;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.jsfm.webflux_coupon_management.domain.entities.Redemption;

import reactor.core.publisher.Flux;

public interface RedemptionRepository extends ReactiveCrudRepository<Redemption, Long> {
    Flux<Redemption> findByUserId(Long userId);
}
