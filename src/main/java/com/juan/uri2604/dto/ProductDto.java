package com.juan.uri2604.dto;

import com.juan.uri2604.entities.Product;

public class ProductDto {

    private Long id;
    private String name;
    private Integer amount;
    private Double price;

    public ProductDto(Long id, String name, Integer amount, Double price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public ProductDto(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.amount = product.getAmount();
        this.price = product.getPrice();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAmount() {
        return amount;
    }

    public Double getPrice() {
        return price;
    }
}
