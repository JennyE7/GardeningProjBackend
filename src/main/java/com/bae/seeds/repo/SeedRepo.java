package com.bae.seeds.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.seeds.domain.Seed;

@Repository
public interface SeedRepo extends JpaRepository<Seed, Integer> {

}
