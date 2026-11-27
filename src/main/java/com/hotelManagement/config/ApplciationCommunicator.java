package com.hotelManagement.config;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ApplciationCommunicator 
{
   private final RestTemplate restTemplate;
   
   public Float getActualRating(Long hotelId)
   {
	   String url = "http://localhost:8084/rating/getHotelId"+hotelId;
	   
	   ResponseEntity<Float> rating  = restTemplate.getForEntity(url, Float.class);
	   return rating.getBody();
   }

}
