package com.bae.seeds.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bae.seeds.domain.Seed;
import com.bae.seeds.service.SeedService;

public class SeedController {
	
	@Autowired
	private SeedService service;
	
	@PostMapping("/create")
	public ResponseEntity<Seed> create(@RequestBody Seed seed) {
		ResponseEntity<Seed> created = new ResponseEntity<>(this.service.create(seed), HttpStatus.CREATED);
		return created;
	}

}
