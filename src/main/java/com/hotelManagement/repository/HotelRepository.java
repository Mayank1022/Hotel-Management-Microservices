package com.hotelManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelManagement.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{
   
}
