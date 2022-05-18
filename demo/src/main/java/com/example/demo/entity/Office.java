package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "office")
@Data
public class Office {
    @Id
    private Long cityId;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "state")
    private String state;

    @Column(name = "address")
    private String address;

    @Column(name = "creared_date")
    @CreatedDate
    private Instant createdDate;
}
