package com.getapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getapi.entity.Ticket;
import com.getapi.repository.TicketRepository;

@Service
public class getApiServiceimpl implements getApiService {

	@Autowired
	private TicketRepository ticketRepository;
	
	@Override
	public List<Ticket> getAllTickets() {
		return ticketRepository.findAll();
	}
	
	
}
