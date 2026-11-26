package com.hotelRating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelRating.entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long>
{
    
}
