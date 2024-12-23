package com.getapi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getapi.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Serializable> {

}
