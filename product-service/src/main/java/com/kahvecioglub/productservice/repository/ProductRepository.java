package com.kahvecioglub.productservice.repository;

import com.kahvecioglub.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  ProductRepository extends MongoRepository<Product, String> {


}
