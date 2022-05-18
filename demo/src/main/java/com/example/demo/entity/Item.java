package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "item")
@Data
public class Item {
    @Id
    private Long itemId;

    @Column(name = "description")
    private String description;

    @Column(name = "size")
    private Integer size;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "price")
    private Double price;

    @Column(name = "start_sale_date")
    private Instant startSaleDate;
}
