package com.example.demo.controller;

import com.example.demo.controller.dto.Data;
import com.example.demo.service.FillDataService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.List;

@RestController
public class DemoController {
    @Autowired
    FillDataService service;

    private final Gson gson = new Gson();

    @PostMapping("/customer")
    private ResponseEntity<?> getListJson() throws IOException {

        BufferedReader objReader = new BufferedReader(new FileReader("D:\\DataWarehouse\\db.json"));
        System.out.println(objReader);
        Data data = gson.fromJson(objReader, Data.class);
        Long before = Instant.now().getLong(ChronoField.MILLI_OF_SECOND);
        service.fillDataIntoDataBase(data);
        Long after = Instant.now().getLong(ChronoField.MILLI_OF_SECOND);
        System.err.println(String.format("Time spend: %s",(after - before)));
        return ResponseEntity.ok("Success");
    }
}
