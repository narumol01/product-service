package com.example.week9.productservice.command.rest;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateProductRestMode {
    private String title;
    private BigDecimal price;
    private Integer quantity;
}
