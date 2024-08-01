package com.kiwi.coupon_redemption.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiwi.coupon_redemption.domain.entities.UserEntity;
import com.kiwi.coupon_redemption.infraestructure.services.UserService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Mono<UserEntity> registerUser(@RequestBody SecurityProperties.User user) {
        return userService.registerUser(user);
    }
}