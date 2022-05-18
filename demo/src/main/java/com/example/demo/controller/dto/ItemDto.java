package com.example.demo.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDto {
    Long item_id;
    String description;
    String price;
    Integer size;
    String start_sale_date;
    Double weight;
}
