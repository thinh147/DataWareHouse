package com.example.demo.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemStorageDto {
    Long store_id;
    Long item_id;
    Integer quantity;
    String updated_date;
}
