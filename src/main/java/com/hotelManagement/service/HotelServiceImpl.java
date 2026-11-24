package com.hotelManagement.service;

import org.springframework.stereotype.Service;

import com.hotelManagement.dto.HotelDto;
import com.hotelManagement.entity.Hotel;
import com.hotelManagement.repository.HotelRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {
	private final HotelRepository hotelRepository;

	@Override
	public Hotel create(HotelDto dto) {
		return hotelRepository.save(Hotel.builder().name(dto.getName()).address(dto.getAddress()).city(dto.getCity())
				.postalCode(dto.getPostalCode()).rating(dto.getRating()).isAvailable(dto.getIsAvailable()).build());
	}

}
