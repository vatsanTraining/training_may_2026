package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.TravelPackage;
import com.example.demo.exceptions.RangeCheckException;

import lombok.Data;

@Repository
@Data
public class TravelPackageRepoistory {

	
	
	public List<TravelPackage> getPackages() throws RangeCheckException{
		
		List<TravelPackage> list = new ArrayList<>();
		
		list.add(new TravelPackage("paris",60000.00,2,false));
		
		list.add(new TravelPackage("lanka",56000.00,3,false));
		
		list.add(new TravelPackage("nepal",70000.00,5,true));
		
		return list;
	}
}
