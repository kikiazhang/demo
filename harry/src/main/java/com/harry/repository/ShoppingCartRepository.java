package com.harry.repository;

import org.springframework.data.repository.CrudRepository;

import com.harry.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long>{

}
