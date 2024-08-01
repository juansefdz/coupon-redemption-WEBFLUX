package com.kiwi.coupon_redemption.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
            .title("Coupon Management API")
            .version("1.0")
            .description("API for managing and redeeming coupons."));
    }
}