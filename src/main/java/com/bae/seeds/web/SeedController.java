package com.bae.seeds.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Seed>> getAll() {
		ResponseEntity<List<Seed>> seeds = new ResponseEntity<>(this.service.getAll(), HttpStatus.OK);
		return seeds;
	}
	
	@DeleteMapping
	public ResponseEntity<Seed> Delete(@RequestBody Seed seed) {
		this.service.delete(seed);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
