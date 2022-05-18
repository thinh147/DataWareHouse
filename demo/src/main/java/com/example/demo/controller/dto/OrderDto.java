package com.example.demo.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDto {
    Long order_id;
    Long customer_id;
    String date_order;
}
