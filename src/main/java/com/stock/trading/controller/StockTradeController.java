package com.stock.trading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stock.trading.model.User;
import com.stock.trading.service.UserAuthenticationService;

@Controller
public class StockTradeController {
	
	@Autowired
	private UserAuthenticationService userAuthenticationService;
	
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
	
	@GetMapping(value ="/test/")
	public ResponseEntity<?> test() {
		return ResponseEntity.ok("Hii Admin");
	}
	
	@PostMapping(value ="/addUser")
	public ResponseEntity<?> addUser(@RequestBody User user) {
		userAuthenticationService.registerUser(user);
		return ResponseEntity.ok("user added");
	}
}
