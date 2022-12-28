package com.example.demo.core.domain.service.interfaces;

import com.example.demo.core.domain.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product, Integer> {

}


