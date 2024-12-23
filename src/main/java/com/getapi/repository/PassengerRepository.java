package com.getapi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getapi.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Serializable> {

}
