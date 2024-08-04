package com.jsfm.webflux_coupon_management.domain.entities;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "redeemptions")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Redemption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String couponCode;
    private LocalDateTime redemptionDate;
    private Long productId;
    private Long userId;
}
