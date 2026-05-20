package com.example.demo.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dtos.TravelPackageDto;
import com.example.demo.entity.TravelPackage;
import com.example.demo.ifaces.TravelPackageRepo;


@Service
public class TravelService {

	
	private TravelPackageRepo repo;

	
	
	
	public TravelService(TravelPackageRepo repo) {
		super();
		this.repo = repo;
	}
	public List<TravelPackageDto> findAll() {
		
		 return this.repo.findAll().stream().map(e -> entityToDto(e)).toList();
	}
	
	public TravelPackageDto  save(TravelPackageDto entity) {
		
		
		TravelPackage saved= this.repo.save(DtoToEntity(entity));
		
		
		return entityToDto(saved);
	}
	
	public TravelPackageDto findById(Long id) {
		
		TravelPackage found = this.repo.findById(id)
				 .orElseThrow(()-> new RuntimeException("Element with Given Id Not Found"));
	
		 return entityToDto(found);
	}
	
	public TravelPackageDto removeByid(Long id) {
		
		repo.deleteById(id);
		
		//TODO
		return null;
	}
	
	public TravelPackageDto update(Long id, TravelPackageDto updated) {
		
		//TODO
		return null;
	}
	
	private TravelPackageDto  entityToDto(TravelPackage entity) {
		
		
		return new TravelPackageDto(entity.getId(), entity.getDestination(), entity.getBasePrice(),
				entity.getTravelerCount(), entity.isFirstTimeTraveller());
	}
	
	private TravelPackage DtoToEntity(TravelPackageDto dto) {
		
		return new TravelPackage(dto.id(),
				dto.destination(), dto.basePrice(), dto.travelCount(),
				dto.isFirstTimeTraveller());
	}
}
