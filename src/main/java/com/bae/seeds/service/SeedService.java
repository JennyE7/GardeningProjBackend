package com.bae.seeds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.seeds.domain.Seed;
import com.bae.seeds.repo.SeedRepo;

@Service
public class SeedService {
	
	private SeedRepo repo;
	
	@Autowired
	private SeedService(SeedRepo repo) {
		this.repo = repo;
	}
	
	public Seed create(Seed seed) {
		return this.repo.save(seed);
	}
	
	public List<Seed> getAll() {
		return this.repo.findAll();
	}
	
	public void delete(Seed seed) {
		this.repo.delete(seed);
	}
	
	public Seed getById(Integer id) {
		return this.repo.findById(id).get();
	}
	public Seed update(Integer id, Seed seed) {
		Seed newSeed = this.getById(id);
		newSeed.setSeedName(seed.getSeedName());
		newSeed.setSowByMonth(seed.getSowByMonth());
		newSeed.setHarvestByMonth(seed.getHarvestByMonth());
		newSeed.setExpirationDate(seed.getExpirationDate());
		newSeed.setIsPlanted(seed.isIsPlanted());
		
		return this.repo.save(newSeed);
	}
	
	public List<Seed> getByName(String name) {
		return this.repo.findBySeedNameIgnoreCase(name);
	}

}
