package com.example.demo.ifaces;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.TravelPackage;

public interface TravelPackageRepo extends CrudRepository<TravelPackage, Long> {

}
