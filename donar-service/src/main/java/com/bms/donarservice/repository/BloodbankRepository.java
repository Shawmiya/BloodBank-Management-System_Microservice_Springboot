package com.bms.donarservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.donarservice.model.Bloodbank;


public interface BloodbankRepository extends JpaRepository<Bloodbank, Integer>{

}
