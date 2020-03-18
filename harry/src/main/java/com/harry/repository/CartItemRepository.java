package com.harry.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.harry.domain.CartItem;
import com.harry.domain.ShoppingCart;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
//	List<CartItem> findByOrder(Order order);
}
