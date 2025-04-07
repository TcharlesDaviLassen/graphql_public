package com.graphql.services;

import com.graphql.entities.ProductEntity;
import com.graphql.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductEntity createProduct(String name, Double price) {
        return productRepository.save(new ProductEntity(null, name, price, null));
    }
}
