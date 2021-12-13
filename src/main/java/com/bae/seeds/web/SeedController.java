package com.bae.seeds.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.seeds.domain.Seed;
import com.bae.seeds.service.SeedService;

@CrossOrigin
@RestController
public class SeedController {
	
	private SeedService service;
	
	@Autowired
	public SeedController(SeedService service) {
		this.service = service;
	}
	
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
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Seed> delete(@PathVariable Integer id) {
		this.service.delete(this.service.getById(id));
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Seed> update(@PathVariable Integer id, @RequestBody Seed seed) {
		return new ResponseEntity<>(this.service.update(id, seed), HttpStatus.ACCEPTED);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Seed> getById(@PathVariable Integer id) {
		return new ResponseEntity<>(this.service.getById(id), HttpStatus.OK);
	}
}
