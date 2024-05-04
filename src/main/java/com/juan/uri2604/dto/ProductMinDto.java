package com.juan.uri2604.dto;

import com.juan.uri2604.entities.Product;

public class ProductMinDto {

    private Long id;
    private String name;

    public ProductMinDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductMinDto(Product product) {
        this.id = product.getId();
        this.name = product.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
