package com.bms.loginservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.loginservice.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRole(String role);
}
