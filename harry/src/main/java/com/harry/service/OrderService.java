package com.harry.service;

import com.harry.domain.BillingAddress;
import com.harry.domain.Order;
import com.harry.domain.Payment;
import com.harry.domain.ShippingAddress;
import com.harry.domain.ShoppingCart;
import com.harry.domain.User;

public interface OrderService {

	Order createOrder(
			ShoppingCart shoppingCart, 
			ShippingAddress shippingAddress, 
			BillingAddress billingAddress,
			Payment payment, 
			String shippingMethod, 
			User user
	);

}