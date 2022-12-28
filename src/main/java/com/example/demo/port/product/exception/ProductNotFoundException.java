package com.example.demo.port.product.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(int id) {
      super("Could not find product " +id);
    }
}
