package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "item_storage")
@Data
public class ItemStorage implements Serializable {
    @Id
    @ManyToOne(targetEntity = Item.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @Id
    @ManyToOne(targetEntity = Store.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "updatedDate")
    @LastModifiedDate
    private Instant updatedDate;
}
