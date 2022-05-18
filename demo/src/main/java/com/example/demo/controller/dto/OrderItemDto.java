package com.example.demo.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemDto {
    Long order_id;
    Long item_id;
    String order_price;
    Integer order_quantity;
}
