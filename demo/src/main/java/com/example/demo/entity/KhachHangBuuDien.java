package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "khach_hang_buu_dien")
public class KhachHangBuuDien extends KhachHang{
    @Column(name = "dia_chi")
    private String address;

    @Column(name = "thoi_gian")
    private String time;
}
