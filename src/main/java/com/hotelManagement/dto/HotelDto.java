package com.hotelManagement.dto;

import lombok.Data;

@Data
public class HotelDto 
{
   private String name;
   private String address;
   private String city;
   private Float rating;
   private Integer postalCode;
   private Boolean isAvailable;
}
