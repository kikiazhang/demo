package com.harry.service;

import java.util.List;

import com.harry.domain.Product;

public interface ProductService {
	List<Product> findAll();
	
	Product findOne(Long id);
	
	Product save(Product product);
	
	List<Product> blurrySearch(String keyword);
	
	void removeOne(Long id);
}
