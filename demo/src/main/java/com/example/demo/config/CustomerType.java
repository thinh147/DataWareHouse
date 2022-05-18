package com.example.demo.config;

public enum CustomerType {
    POST(1, "post"),
    TRAVEL(2, "travel"),
    BOTH(3, "both");

    private final Integer type;
    private final String typeInStr;

    CustomerType(Integer type, String typeInStr) {
        this.type = type;
        this.typeInStr = typeInStr;
    }
}
