package com.example.Product_Midware.DTO;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private String type;
    private double price;
}
