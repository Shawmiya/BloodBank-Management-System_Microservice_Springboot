package com.bms.seekerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.seekerservice.model.Seeker;

public interface SeekerRepository extends JpaRepository<Seeker, Integer> {

}
