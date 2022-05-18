package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
public class Orders {
    @Id
    private Long orderId;

    @Column(name = "date_order")
    private Instant dateOrder;

    @Column(name = "customer_id")
    private Long customerId;
}
