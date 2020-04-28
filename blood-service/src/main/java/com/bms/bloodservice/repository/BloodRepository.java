package com.bms.bloodservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.bloodservice.model.Blood;

public interface BloodRepository extends JpaRepository<Blood, Integer> {

}
