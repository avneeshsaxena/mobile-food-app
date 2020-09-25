package com.avneesh.mobileFood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avneesh.mobileFood.entity.MobilFood;
import com.avneesh.mobileFood.request.MobilFoodie;
import com.avneesh.mobileFood.service.MobileFoodService;

@RestController
public class FoodController 
{
	@Autowired
	private MobileFoodService mfs;
	
	@RequestMapping(path="foodMobile")
	public void setDataInDB()
	{
		mfs.saveMobilFoodData();
	}
	
	
	@GetMapping("getAllfood")
	public List<MobilFood> getAllFoodData()
	{
		return mfs.getAllFoodData();
	}
	
	@PutMapping("updateAll/{locationId}")
	
	public MobilFood updateData(@PathVariable int locationId, @RequestBody MobilFoodie mobile)
	{
		return mfs.updateFood(locationId, mobile);
	}
	
	@DeleteMapping("deleteAll/{locationId}")
	
	public MobilFood delete(@PathVariable int locationId)
	{
		return mfs.deleteFood(locationId);
	}
}
