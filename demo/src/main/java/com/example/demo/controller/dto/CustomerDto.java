package com.example.demo.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {
    Long customer_id;
    Long city_id;
    String customer_name;
    String date_first_order;
    String post_address;
    String tour_guide;
    Integer type;
}
