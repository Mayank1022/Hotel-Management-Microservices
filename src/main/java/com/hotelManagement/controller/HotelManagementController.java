package com.hotelManagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelManagement.dto.HotelDto;
import com.hotelManagement.entity.Hotel;
import com.hotelManagement.service.HotelService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/hotel")
@RequiredArgsConstructor
public class HotelManagementController {

	private final HotelService hotelService;

	@PostMapping("/create")
	public ResponseEntity<Hotel> createHotel(@RequestBody HotelDto hotelDto) {
		return ResponseEntity.ok(hotelService.create(hotelDto));
	}
}
