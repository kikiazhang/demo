package com.harry.repository;

import org.springframework.data.repository.CrudRepository;

import com.harry.domain.CartItem;
import com.harry.domain.ProductToCartItem;

public interface ProductToCartItemRepository extends CrudRepository<ProductToCartItem, Long>{
	void deleteByCartItem(CartItem cartItem);
}
