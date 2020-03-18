package com.harry.repository;

import org.springframework.data.repository.CrudRepository;

import com.harry.domain.ShippingAddress;

public interface ShippingAddressRepository extends CrudRepository<ShippingAddress, Long> {
	
}
