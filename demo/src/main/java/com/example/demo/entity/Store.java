package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "store")
@Data
public class Store {
    @Id
    private Long storeId;

    @Column(name = "phone")
    private String phoneNumber;

    @Column(name = "store_created_date")
    @CreatedDate
    private Instant storeCreatedDate;

    @Column(name = "office_city_id")
    private Long officeId;
}
