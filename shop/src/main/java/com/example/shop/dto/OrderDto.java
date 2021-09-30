package com.example.shop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class OrderDto {
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String address;
    private int totalCost;
    private LocalDateTime orderData;
    private String status;
}
