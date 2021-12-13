package com.bae.seeds.service;

import org.springframework.stereotype.Service;

import com.bae.seeds.domain.Seed;
import com.bae.seeds.repo.SeedRepo;

@Service
public class SeedService {
	
	private SeedRepo repo;
	
	public Seed create(Seed seed) {
		return this.repo.save(seed);
	}

}
