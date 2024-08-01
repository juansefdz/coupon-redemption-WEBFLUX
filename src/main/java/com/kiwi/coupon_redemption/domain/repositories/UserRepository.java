package com.kiwi.coupon_redemption.domain.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.kiwi.coupon_redemption.domain.entities.UserEntity;

import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<UserEntity, Long> {
    Mono<UserEntity> findByUserName(String userName);
    
}
