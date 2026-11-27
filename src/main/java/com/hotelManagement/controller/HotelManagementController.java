package com.hotelManagement.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelManagement.config.ApplciationCommunicator;
import com.hotelManagement.dto.HotelDto;
import com.hotelManagement.entity.Hotel;
import com.hotelManagement.service.HotelService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/hotel")
@RequiredArgsConstructor
public class HotelManagementController {

	private final HotelService hotelService;
	private final ApplciationCommunicator communicator;

	@PostMapping("/addNew")
	public ResponseEntity<?> addNew(@RequestBody HotelDto hotelDto) {
		Hotel hotel = hotelService.create(hotelDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotel);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Hotel>> getAll() {
		return ResponseEntity.ok(hotelService.getAll());
	}

	@GetMapping("/getById/{id}")
	public ResponseEntity<Hotel> getById(@PathVariable("id") Long id) {
		Hotel hotel = hotelService.getById(id);

		hotel.setRating(communicator.getActualRating(hotel.getId()));
		return ResponseEntity.ok(hotel);
	}

}
