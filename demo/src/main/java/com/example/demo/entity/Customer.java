package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    private Long customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "date_first_order")
    private Instant dateFirstOrder;

    @Column(name = "type")
    private Integer type;

    @Column(name = "post_address")
    private String postAddress;

    @Column(name = "tour_guide")
    private String tourGuide;

    @Column(name = "city_id")
    private Long officeId;
}
