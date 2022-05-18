package com.example.demo.service;

import com.example.demo.controller.dto.*;

import java.util.List;

public interface FillDataService {
    void fillDataToOffice(List<OfficeDto> officeDto);
    void fillDataToItem(List<ItemDto> itemDto);
    void fillDataToCustomer(List<CustomerDto> CustomerDto);
    void fillDataToStore(List<StoreDto> storeDto);
    void fillDataToOrder(List<OrderDto> orderDto);
    void fillDataToItemStorage(List<ItemStorageDto> officeDto);
    void fillDataToOrderItem(List<OrderItemDto> officeDto);
    void fillDataIntoDataBase(Data data);
}
