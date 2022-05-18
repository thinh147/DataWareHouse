package com.example.demo.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Data {
    public List<OfficeDto> office;
    public List<CustomerDto> customer;
    public List<ItemDto> item;
    public List<ItemStorageDto> item_storage;
    public List<OrderDto> order;
    public List<OrderItemDto> order_item;
    public List<StoreDto> store;
}
