package com.jba.hotelservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

	@GetMapping("hotel-service-status/{user}")
	public ResponseEntity<?> hotelServiceStatus(@PathVariable String user) {
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("User", user + " logged in successfully");
		hm.put("status", "Success");
		return new ResponseEntity<Object>(hm, HttpStatus.OK);

	}
}
