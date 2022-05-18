package com.example.demo.service;

import com.example.demo.controller.KhachHangDto;
import com.example.demo.entity.KhachHang;
import com.example.demo.repository.KhachHangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceDemoImp implements ServiceDemo {
    @Autowired
    KhachHangRepo khachHangRepo;
    @Override
    public void fillDataIntoKhachHang(List<KhachHangDto> list) {
        khachHangRepo.saveAll(list.stream().map(item -> {
            KhachHang khachHang = new KhachHang();
            khachHang.setId(item.getId());
            khachHang.setCustomerName(item.getName());
            khachHang.setDateFirstOrder(Instant.parse(item.getDate()));
            return khachHang;
        }).collect(Collectors.toList()));
    }
}
