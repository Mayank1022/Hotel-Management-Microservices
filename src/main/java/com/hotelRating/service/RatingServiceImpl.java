package com.hotelRating.service;

import org.springframework.stereotype.Service;

import com.hotelRating.entity.Rating;
import com.hotelRating.repository.RatingRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl implements RatingService {
	private final RatingRepository ratingRepository;

	@Override
	public void addRating(Rating rating) {
		ratingRepository.save(rating);
	}

	@Override
	public Rating findByHotelId(Long hoteId) {

		return ratingRepository.findByHotelId(hoteId).orElse(null);

	}

}
