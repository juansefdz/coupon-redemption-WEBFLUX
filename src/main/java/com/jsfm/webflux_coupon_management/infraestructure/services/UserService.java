package com.jsfm.webflux_coupon_management.infraestructure.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import com.jsfm.webflux_coupon_management.domain.entities.UserEntity;
import com.jsfm.webflux_coupon_management.domain.repositories.UserRepository;

import reactor.core.publisher.Mono;

@Service
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