package com.example.demo.io;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.TravelPackage;

public class TextFileService {

	
	public boolean writeToFile(File file , TravelPackage travel) {
		
		boolean flag = false;
		
		try(PrintWriter writer = new PrintWriter(new FileWriter((file),true))) {
			
			writer.println(travel);
			
			flag =true;
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return flag;
	}
	
	public List<TravelPackage> readFromFile(File file){
		
		List<TravelPackage> list = new ArrayList<>();
		
		// TODO
		
		return list;
		
	}
}
