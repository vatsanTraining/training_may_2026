package com.example.demo.repo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.TravelPackage;
import com.example.demo.exceptions.RangeCheckException;

@Repository
@Primary
public class TravelPackageSetRepository implements TravelRepo {

	@Override
	public Collection<TravelPackage> getPackages() throws RangeCheckException {

		 Set<TravelPackage> list = new HashSet<>();
		
		list.add(new TravelPackage("paris",60000.00,2,false));
		
		list.add(new TravelPackage("lanka",56000.00,3,false));
		
		list.add(new TravelPackage("nepal",70000.00,5,true));
		
		list.add(new TravelPackage("paris",60000.00,2,false));

		
		return list	;
		
					}

}
