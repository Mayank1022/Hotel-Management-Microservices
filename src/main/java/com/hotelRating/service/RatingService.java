package com.hotelRating.service;

import com.hotelRating.entity.Rating;

public interface RatingService 
{
    
   void addRating(Rating rating);
   
   Rating findByHotelId(Long hoteId);
    
}
