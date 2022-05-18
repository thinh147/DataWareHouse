package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "item_storage")
@Data
public class ItemStorage{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_storage_id")
    private Long id;

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "store_id")
    private Long storeId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "updatedDate")
    @LastModifiedDate
    private Instant updatedDate;
}
