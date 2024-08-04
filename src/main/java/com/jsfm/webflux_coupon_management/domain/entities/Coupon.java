package com.jsfm.webflux_coupon_management.domain.entities;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "coupons")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    @Id
    private Long code;
    private LocalDate expirationDate;
    private double discount;
    
}
