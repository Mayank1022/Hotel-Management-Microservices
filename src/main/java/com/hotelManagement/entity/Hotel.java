package com.hotelManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Hotel 
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   
   @Column(name = "name")
   private String name;
   
   @Column(name = "address")
   private String address;
   
   @Column(name = "city")
   private String city;
   
   @Column(name ="rating")
   private Float rating;
   
   @Column(name = "postal_code")
   private Integer postalCode;
   
   @Column(name = "available")
   private Boolean isAvailable;
}
