package com.hotelManagement.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getById(Long id) {
		Optional<Hotel> hotel = hotelRepository.findById(id);
		return hotel.orElse(null);
	}

}
