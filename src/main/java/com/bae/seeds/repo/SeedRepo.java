package com.bae.seeds.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.seeds.domain.Seed;

public interface SeedRepo extends JpaRepository<Seed, Integer> {

}
