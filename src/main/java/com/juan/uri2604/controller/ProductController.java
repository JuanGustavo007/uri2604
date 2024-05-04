package com.juan.uri2604.controller;

import com.juan.uri2604.dto.ProductDto;
import com.juan.uri2604.dto.ProductMinDto;
import com.juan.uri2604.entities.Product;
import com.juan.uri2604.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable Long id) {
        ProductDto product = productService.findProductById(id);
        return ResponseEntity.ok(product);
    }


    @GetMapping
    public ResponseEntity<List<ProductMinDto>> getProduct() {
        List<ProductMinDto> productMinDtos = productService.findAllProductsByPrice();
        return ResponseEntity.ok(productMinDtos);
    }
}
