package com.example.demo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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

		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			
			String line =null;
			
			while( (line=reader.readLine())!=null) {
				
				String[] values = line.split(",");
				
				TravelPackage travel = new TravelPackage();
				
				travel.setDestination(values[0]);
				travel.setBasePrice(Double.parseDouble(values[1]));
				travel.setTravelerCount(Integer.parseInt(values[2]));
				
				list.add(travel);
				
			}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return list;
		
	}
}
