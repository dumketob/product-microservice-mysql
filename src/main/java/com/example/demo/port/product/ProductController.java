package com.example.demo.port.product;

import com.example.demo.core.domain.model.Product;
import com.example.demo.core.domain.service.interfaces.IProductService;
import com.example.demo.port.product.exception.ProductNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@RestController
public class ProductController {

	@Autowired
	private IProductService productService;

	@Autowired
	private Producer producer;

	@PostMapping(path="/product")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody void create (@RequestBody Product product) {
		productService.createProduct(product);
	}

	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable int id) {
		Product product = productService.getProduct(id);

		if(product == null){
			throw new ProductNotFoundException(id);
		}

		return product;
	}

	@PutMapping(path="/product")
	public @ResponseBody String update () {
		return null;
	}

	@GetMapping(path="/product")
	public @ResponseBody String delete () {
		return null;
	}

	@GetMapping("/products")
	public @ResponseBody Iterable<Product> getProducts() {
		return productService.getAllProducts();
	}

	@Autowired
	RabbitMQProducer rabbitMQProducer;

	@GetMapping("/affe")
	public void affe() {
		try {
			rabbitMQProducer.sendMessage("affe");
		} catch (Exception e) {
		}
	}


}
