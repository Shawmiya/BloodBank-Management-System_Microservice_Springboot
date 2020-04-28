package com.bms.donarservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.donarservice.model.donar;

public interface DonarRepository extends JpaRepository<donar, Integer> {

}
