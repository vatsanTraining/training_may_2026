package com.example.demo.services;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dtos.TravelPackageDto;
import com.example.demo.dtos.TravelPackgeResponseDto;
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
		
		
		TravelPackage saved= this.repo.save(dtoToEntity(entity));
		
		
		return entityToDto(saved);
	}
	
	public TravelPackageDto findById(Long id) {
		
		TravelPackage found = this.repo.findById(id)
				 .orElseThrow(()-> new RuntimeException("Element with Given Id Not Found"));
	
		 return entityToDto(found);
	}
	
	public void removeByid(Long id) {
		
		if (!this.repo.existsById(id)) {
	        throw new RuntimeException("Element Not  found with id: " + id);
	    }
	     this.repo.deleteById(id);
		
	}
	
	@Transactional
	public TravelPackageDto update(Long id, TravelPackageDto toUpdate) {
		
		if (!repo.existsById(toUpdate.id())) {
            throw new RuntimeException("Cannot update" + toUpdate.id() + " not found");
        }
		
		TravelPackage updated= repo.save(dtoToEntity(toUpdate));
		 
		 return entityToDto(updated);
	}
	
	public List<TravelPackageDto> findByDestination(String destination){
		
		return this.repo.findByDestination(destination)
				.stream().map(this::entityToDto).toList();
	}
	
  public List<TravelPackgeResponseDto> findByTravelCount(int value){
		
		return this.repo.findByTravelerCountGreaterThan(value);
	}

	private TravelPackageDto  entityToDto(TravelPackage entity) {
		
		
		return new TravelPackageDto(entity.getId(), entity.getDestination(), entity.getBasePrice(),
				entity.getTravelerCount(), entity.isFirstTimeTraveller());
	}
	
	
	private TravelPackage dtoToEntity(TravelPackageDto dto) {
		
		return new TravelPackage(dto.id(),
				dto.destination(), dto.basePrice(), dto.travelCount(),
				dto.isFirstTimeTraveller());
	}
	
	
}
