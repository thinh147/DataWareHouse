package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "order_item")
@Data
public class OrderItem implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Orders.class)
    @JoinColumn(name = "order_id")
    private Orders orders;

    @Id
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Item.class)
    @JoinColumn(name = "item_id")
    private Item item;

    @Column(name = "order_quantity")
    private Integer quantity;

    @Column(name = "order_price")
    private Double price;
}
