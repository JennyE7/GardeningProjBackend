package com.bae.seeds.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.seeds.domain.Seed;
import com.bae.seeds.repo.SeedRepo;

@Service
public class SeedService {
	
	private SeedRepo repo;
	
	public Seed create(Seed seed) {
		return this.repo.save(seed);
	}
	
	public List<Seed> getAll() {
		return this.repo.findAll();
	}

}
