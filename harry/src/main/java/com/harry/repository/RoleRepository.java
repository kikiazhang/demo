package com.harry.repository;

import org.springframework.data.repository.CrudRepository;

import com.harry.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

}
