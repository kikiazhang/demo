package com.harry.repository;

import org.springframework.data.repository.CrudRepository;

import com.harry.domain.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long>{

}
