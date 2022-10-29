package com.stock.trading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class StockTradeController {
	
	@Autowired
//	private StockTradeService stockTradeService;
	
	@PostMapping(value = "/check/")
	public ResponseEntity<?> checkIfAccountAttached(@RequestBody String email){
		
//		//boolean result = this.stockTradeService.getProfileAttribute(email);
//		
//		if(!result) {
//			return ResponseEntity.badRequest().body("Bank details is not attached for this relative");
//		}else {
			return ResponseEntity.ok("success");
//		}
		
	}
	
	

}
