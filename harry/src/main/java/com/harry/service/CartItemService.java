package com.harry.service;

import java.util.List;

import com.harry.domain.CartItem;
import com.harry.domain.Product;
import com.harry.domain.ShoppingCart;
import com.harry.domain.User;

public interface CartItemService {
	
	CartItem addProductToCartItem(Product product, User user, int qty);
	
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
//	List<CartItem> findByOrder(Order order);
	
	CartItem updateCartItem(CartItem cartItem);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem findById(Long id);
	
	CartItem save(CartItem cartItem);

}
