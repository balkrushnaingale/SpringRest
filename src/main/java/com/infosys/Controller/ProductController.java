package com.infosys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.dto.Product;
import com.infosys.service.ProductServiceImpl;

@RestController
@RequestMapping("/rest")
public class ProductController {
	@Autowired
	
	ProductServiceImpl service;

	
	@GetMapping("/hello")
	public String sayhello() {
		return "hello spring java developer.......!";
	}
	@GetMapping("/product")
	public Product getProduct() {
		Product p=new Product(1,"lux",20,6); 
		
	return p;
			
	}

	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable("id")int id) {
	Product p= service.getProduct(id);
	return p;
	
}
	@GetMapping("/products")
	public Iterable<Product>getProducts(){
		return service.getProduct();
	}
	@PostMapping ("/addproduct")
	public Product addProduct(@RequestBody Product p) {
		service.addProduct(p);
		return p;
	}
	@PutMapping("/modproduct")
	public Product modproduct(@RequestBody Product p) {
		return service.modProduct(p);
		
	}
	@DeleteMapping("/delproduct/{id}")
	public Product delProduct(@PathVariable("id")int id) {
		return service.delProduct(id);
	}
}

