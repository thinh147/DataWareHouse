package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "khach_hang_du_lich")
public class KhachHangDuLich extends KhachHang{
    @Column(name = "huong_dan_vien_tour")
    private String tourGuide;

    @Column(name = "thoi_gian")
    private Instant time;
}
