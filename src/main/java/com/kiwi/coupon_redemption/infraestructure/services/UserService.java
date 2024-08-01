package com.kiwi.coupon_redemption.infraestructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;


import com.kiwi.coupon_redemption.domain.entities.UserEntity;
import com.kiwi.coupon_redemption.domain.repositories.UserRepository;

import reactor.core.publisher.Mono;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Mono<UserEntity> registerUser(SecurityProperties.User user) {
        UserEntity userEntity = UserEntity.builder()
                                          .userName(user.getName())
                                          .build();
        return userRepository.save(userEntity);
    }
}