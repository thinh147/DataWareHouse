package com.example.demo.service;

import com.example.demo.controller.dto.*;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class FillDataServiceImp implements FillDataService{
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    ItemRepo itemRepo;
    @Autowired
    ItemStorageRepo itemStorageRepo;
    @Autowired
    OfficeRepo officeRepo;
    @Autowired
    OrderItemRepo orderItemRepo;
    @Autowired
    OrderRepo orderRepo;
    @Autowired
    StoreRepo storeRepo;

    public void fillDataToOffice(List<OfficeDto> officeDto) {
        List<Office> officeList = officeDto.stream().map(item ->{
            Office office = new Office();
            office.setCityId(item.getCity_id());
            office.setAddress(item.getAddress());
            office.setCityName(item.getCity_name());
            office.setCreatedDate(Instant.parse(item.getCreated_date()));
            office.setState(item.getState());
            return office;
        }).collect(Collectors.toList());
        officeRepo.saveAll(officeList);
    }

    public void fillDataToItem(List<ItemDto> itemDto) {
        itemRepo.saveAll(itemDto.stream().map(
                item -> {
                    Item res = new Item();
                    res.setItemId(item.getItem_id());
                    res.setDescription(item.getDescription());
                    res.setPrice(Double.valueOf(item.getPrice()));
                    res.setWeight(item.getWeight());
                    res.setSize(item.getSize());
                    res.setStartSaleDate(Instant.parse(item.getStart_sale_date()));
                    return res;
                }
        ).collect(Collectors.toList()));
    }

    public void fillDataToCustomer(List<CustomerDto> customerDto) {
        customerRepo.saveAll(customerDto.stream().map(item -> {
            Customer customer = new Customer();

            customer.setCustomerId(item.getCustomer_id());
            customer.setCustomerName(item.getCustomer_name());
            customer.setOfficeId(item.getCity_id());
            customer.setDateFirstOrder(Instant.parse(item.getDate_first_order()));
            customer.setTourGuide(item.getTour_guide());
            customer.setType(item.getType());
            customer.setPostAddress(item.getPost_address());

            return customer;
        }).collect(Collectors.toList()));
    }

    public void fillDataToStore(List<StoreDto> storeDto) {
        storeRepo.saveAll(storeDto.stream().map(item -> {
            Store store = new Store();
            store.setStoreId(item.getStore_id());
            store.setOfficeId(item.getOffice_city_id());
            store.setStoreCreatedDate(Instant.parse(item.getStore_created_date()));
            store.setPhoneNumber(item.getPhone_number());
            return store;
        }).collect(Collectors.toList()));
    }

    public void fillDataToOrder(List<OrderDto> orderDto) {
        orderRepo.saveAll(orderDto.stream().map(item -> {
            Orders orders = new Orders();
            orders.setOrderId(item.getOrder_id());
            orders.setDateOrder(Instant.parse(item.getDate_order()));
            orders.setCustomerId(item.getCustomer_id());
            return orders;
        }).collect(Collectors.toList()));
    }

    public void fillDataToItemStorage(List<ItemStorageDto> officeDto) {
        itemStorageRepo.saveAll(officeDto.stream().map(item ->{
            ItemStorage itemStorage = new ItemStorage();
            itemStorage.setItemId(item.getItem_id());
            itemStorage.setStoreId(item.getStore_id());
            itemStorage.setQuantity(item.getQuantity());
            itemStorage.setUpdatedDate(Instant.parse(item.getUpdated_date()));
            return itemStorage;
        }).collect(Collectors.toList()));
    }

    public void fillDataToOrderItem(List<OrderItemDto> officeDto) {
        orderItemRepo.saveAll(officeDto.stream().map(item ->{
            OrderItem orderItem = new OrderItem();
            orderItem.setItemId(item.getItem_id());
            orderItem.setOrderId(item.getOrder_id());
            orderItem.setPrice(Double.valueOf(item.getOrder_price()));
            orderItem.setQuantity(item.getOrder_quantity());
            return orderItem;
        }).collect(Collectors.toList()));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void fillDataIntoDataBase(Data data) {
        try {
            fillDataToOffice(data.getOffice());
            fillDataToItem(data.getItem());
            fillDataToCustomer(data.getCustomer());
            fillDataToStore(data.getStore());
            fillDataToOrder(data.getOrder());
            fillDataToItemStorage(data.getItem_storage());
            fillDataToOrderItem(data.getOrder_item());
        }catch (Exception e){
            log.error(e.getMessage(),e);
        }
    }
}
