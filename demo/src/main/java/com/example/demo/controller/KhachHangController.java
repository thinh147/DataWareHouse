package com.example.demo.controller;

import com.example.demo.service.ServiceDemo;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

@RestController
public class KhachHangController {
    @Autowired
    ServiceDemo serviceDemo;

    private final Gson gson = new Gson();

    @PostMapping("/customer")
    private ResponseEntity<?> getListJson() throws IOException {
        try {
            BufferedReader objReader = new BufferedReader(new FileReader("D:\\customer-2.json"));
            User data = gson.fromJson(objReader, User.class);
            List<KhachHangDto> list = data.getCustomer();
            serviceDemo.fillDataIntoKhachHang(list);
            return ResponseEntity.ok("Success");
        } catch (Exception e) {
            return ResponseEntity.ok("Error" + e.getMessage());
        }
    }
}
