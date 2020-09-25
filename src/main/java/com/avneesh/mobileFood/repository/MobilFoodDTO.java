package com.avneesh.mobileFood.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.avneesh.mobileFood.entity.MobilFood;


@Repository
public interface MobilFoodDTO extends JpaRepository<MobilFood, Integer>
{
	MobilFood findById(int locationid);
	
	//MobilFood DeleteById(int locationid);
}
