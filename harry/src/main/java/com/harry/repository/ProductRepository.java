package com.harry.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.harry.domain.Product;


public interface ProductRepository extends CrudRepository<Product, Long>{

	List<Product> findByTitleContaining(String keyword);

}
