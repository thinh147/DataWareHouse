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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(name = "date_order")
    private Instant dateOrder;

    @ManyToOne(targetEntity = Customer.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "orders", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<OrderItem> orderItems = new ArrayList<>();
}
