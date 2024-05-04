package com.juan.uri2604.repository;


import com.juan.uri2604.dto.ProductMinDto;
import com.juan.uri2604.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT obj FROM Product obj where obj.price > 10 and obj.price < 100")
    List<ProductMinDto> searchProductByPrice();
}
