package com.jsfm.webflux_coupon_management.domain.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.jsfm.webflux_coupon_management.domain.entities.UserEntity;

import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<UserEntity, Long> {
    Mono<UserEntity> findByUserName(String userName);
    
}
