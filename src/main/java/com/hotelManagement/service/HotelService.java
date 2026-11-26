package com.hotelManagement.service;

import java.util.List;

import com.hotelManagement.dto.HotelDto;
import com.hotelManagement.entity.Hotel;

public interface HotelService 
{
    Hotel create(HotelDto dto);
    
    List<Hotel> getAll();
    
    Hotel getById(Long id);
}
