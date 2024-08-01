package com.kiwi.coupon_redemption.domain.repositories;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.kiwi.coupon_redemption.domain.entities.Redemption;

import reactor.core.publisher.Flux;

public interface RedemptionRepository extends ReactiveCrudRepository<Redemption, Long> {
    Flux<Redemption> findByUserId(Long userId);
}
