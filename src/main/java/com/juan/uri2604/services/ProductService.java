package com.juan.uri2604.services;

import com.juan.uri2604.dto.ProductDto;
import com.juan.uri2604.dto.ProductMinDto;
import com.juan.uri2604.entities.Product;
import com.juan.uri2604.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public ProductDto findProductById(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return new ProductDto(product);
    }

    @Transactional(readOnly = true)
    public List<ProductMinDto> findAllProductsByPrice() {
        List<ProductMinDto> products = productRepository.searchProductByPrice();
        return products;
    }
}
