package com.stock.trading.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.stock.trading.model.User;

@Controller
public class Stock {
	
	@Autowired
    private RestTemplate restTemplate;
	
	String apiKey = "TPXDJF6S33EK4HAS";
	
	@GetMapping(value = "/stock")
	@ResponseBody
	public String getStock() {
		
		return this.restTemplate.getForObject("https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=TCS.BSE&outputsize=full&apikey=TPXDJF6S33EK4HAS", String.class);
		
	}
	
	@GetMapping(value = "/hello")
	@ResponseBody
	public String hello() {
		return "helloMate";
	}

}
