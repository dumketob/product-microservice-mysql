package com.example.demo.core.domain.service.impl;

import com.example.demo.core.domain.model.Product;
import com.example.demo.core.domain.service.interfaces.IProductRepository;
import com.example.demo.core.domain.service.interfaces.IProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    private final IProductRepository productRepository;

    ProductService(IProductRepository productRepository){

        this.productRepository = productRepository;
    }

    public void createProduct (Product product) {

        productRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {

        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {

        productRepository.delete(product);
    }

    @Override
    public Product getProduct(int id) {

        return null;
    }

    @Override
    public Iterable<Product> getAllProducts() {

        return productRepository.findAll();
    }

}
