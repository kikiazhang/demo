package com.harry.repository;

import org.springframework.data.repository.CrudRepository;

import com.harry.domain.BillingAddress;

public interface BillingAddressRepository extends CrudRepository<BillingAddress, Long>{

}
