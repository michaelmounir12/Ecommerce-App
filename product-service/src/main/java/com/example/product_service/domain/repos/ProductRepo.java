package com.example.product_service.domain.repos;

import com.example.product_service.domain.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,String> {
}
