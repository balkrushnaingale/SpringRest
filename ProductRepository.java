package com.infosys.repository;

import org.springframework.data.repository.CrudRepository;

import com.infosys.dto.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
