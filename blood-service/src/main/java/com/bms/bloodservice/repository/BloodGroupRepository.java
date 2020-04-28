 package com.bms.bloodservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.bloodservice.model.BloodGroup;

public interface BloodGroupRepository extends JpaRepository<BloodGroup, Integer> {

}
