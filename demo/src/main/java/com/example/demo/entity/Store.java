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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;

    @Column(name = "phone")
    private Long phoneNumber;

    @Column(name = "store_created_date")
    @CreatedDate
    private Instant storeCreatedDate;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Office.class)
    private Office office;

    @OneToMany(mappedBy = "store", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<ItemStorage> itemStorage = new ArrayList<>();
}
