package com.avneesh.mobileFood.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avneesh.mobileFood.entity.MobilFood;
import com.avneesh.mobileFood.repository.MobilFoodDTO;
import com.avneesh.mobileFood.request.MobilFoodie;

@Service
public class MobileFoodService 
{
	@Autowired
	private MobilFoodDTO mdto;
	
	String line = "";
	public void saveMobilFoodData()
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/mobilefood.csv"));
		try {
			while((line=br.readLine())!=null)
			{
				String [] data = line.split(",");
				MobilFood mf = new MobilFood();
				
				mf.setApplicant(data[0]);
				mf.setFacilityType(data[1]);
				mf.setCnn(data[2]);
				mf.setLocationDescription(data[3]);
				
				mdto.save(mf);	
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<MobilFood> getAllFoodData() {
       // List<MobilFood> food = MobilFoodDTO.findAll();
		List<MobilFood> food = mdto.findAll();
        if(null==food)
        	throw new NullPointerException("food not found");
        return food;
    }
	
	 public MobilFood updateFood(int locationid, MobilFoodie mmff) {
		 MobilFood mff = mdto.findById(locationid);
	        if(null==mff)
	            throw new NullPointerException("data not found");
	        mff.setLocationid(mmff.getLocationid());
	        mff.setApplicant(mmff.getApplicant());
	        mff.setCnn(mmff.getCnn());
	        mff.setLocationDescription(mmff.getLocationDescription());
	        mff.setFacilityType(mmff.getFacilityType());
	        
	        
			return mdto.save(mff);
	      
	    }
	 
	 
	 public MobilFood deleteFood(int loctionid) 
	 {
	        MobilFood mff= mdto.findById(loctionid);
	        if(null==mff)
	            throw new NullPointerException("data not found");
	        mdto.delete(mff);
	        return mff;
	    }
	
	                  
	
	
	
	
	
	
	
	
	
	
	
	

}
