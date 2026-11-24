package com.hotelManagement.service;

import com.hotelManagement.dto.HotelDto;
import com.hotelManagement.entity.Hotel;

public interface HotelService 
{
    Hotel create(HotelDto dto);
}
