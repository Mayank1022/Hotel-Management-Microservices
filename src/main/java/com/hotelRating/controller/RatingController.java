package com.hotelRating.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelRating.entity.Rating;
import com.hotelRating.service.RatingService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/rating")
@RequiredArgsConstructor
public class RatingController 
{
	private final RatingService ratingService;
	
	@PostMapping("/addRating")
	public ResponseEntity<?> addRating(@RequestBody Rating rating)
	{
		ratingService.addRating(rating);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	
	@GetMapping("/byHotelId/{HotelId}")
	public ResponseEntity<Float> getHotelRating(@PathVariable("id") Long hotelId)
	{
	   Rating rating	= ratingService.findByHotelId(hotelId);
	   return ResponseEntity.ok(rating.getActualHotelRating());
	} 

}
