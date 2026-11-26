package com.hotelRating.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelRating.entity.Rating;


@Repository
public interface RatingRepository extends JpaRepository<Rating, Long>
{
    Optional<Rating>  findByHotelId(Long hotelId);
}
