package com.harry.repository;

import org.springframework.data.repository.CrudRepository;

import com.harry.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long> {

}
