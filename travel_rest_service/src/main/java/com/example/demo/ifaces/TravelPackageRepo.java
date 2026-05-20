package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.TravelPackage;

public interface TravelPackageRepo extends JpaRepository<TravelPackage, Long> {

}
