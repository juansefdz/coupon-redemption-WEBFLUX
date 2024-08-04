package com.jsfm.webflux_coupon_management.api.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsfm.webflux_coupon_management.domain.entities.UserEntity;
import com.jsfm.webflux_coupon_management.infraestructure.services.UserService;

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