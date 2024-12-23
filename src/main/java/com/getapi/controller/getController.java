package com.getapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getapi.entity.Ticket;
import com.getapi.service.getApiService;

@RestController
@RequestMapping("/irctc")
public class getController {

	@Autowired
	private getApiService getApi;
	

	@GetMapping("/getAllTickets")
	public ResponseEntity<List<Ticket>> getAllTickets(){
		List<Ticket> allTickets = getApi.getAllTickets();
		return new ResponseEntity<> (allTickets, HttpStatus.OK);
	}
}
