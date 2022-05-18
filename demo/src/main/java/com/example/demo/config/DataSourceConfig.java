//package com.example.demo.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DataSourceConfig {
//    @Value("${spring.datasource.url.vp}")
//    public String urlVp;
//
//    @Value("${spring.datasource.username.vp}")
//    public String userNameVp;
//
//    @Value("${spring.datasource.password.vp}")
//    public String passWordVp;
//
//    @Bean
//    public DataSource vanPhong(String url, String dbuser, String password){
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//    public DataSource banHang(String url, String dbuser, String password){
//
//    }
//}
