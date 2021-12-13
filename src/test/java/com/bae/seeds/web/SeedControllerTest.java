package com.bae.seeds.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.validator.internal.constraintvalidators.bv.number.bound.decimal.DecimalMaxValidatorForNumber;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;

import com.bae.seeds.domain.Seed;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts = {"classpath:seed-schema.sql","classpath:seed-data.sql"}, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class SeedControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;

	@Test
	void createTest() throws Exception {
		Seed seed = new Seed(2, "leek", 4, 2, LocalDate.of(2022,1,1), true);
		String seedAsJson = this.mapper.writeValueAsString(seed);
		
		this.mvc.perform(post("/create").contentType(MediaType.APPLICATION_JSON).content(seedAsJson))
		.andExpect(status().isCreated()).andExpect(content().json(seedAsJson));
	}
	
	@Test
	void getAllTest() throws Exception {
		Seed seed = new Seed(1, "Carrot", 6, 10, LocalDate.of(2022, 1, 1), true);
		List<Seed> seeds = List.of(seed);
		String seedsJson = this.mapper.writeValueAsString(seeds);
		
		this.mvc.perform(get("/getAll").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().json(seedsJson));
	}
	
	@Test
	void deleteTest() throws Exception {
		this.mvc.perform(delete("/delete/1")).andExpect(status().isNoContent());
	}
	
	@Test
	void updateTest() throws Exception {
		Seed seed = new Seed(null, "leek", 4, 2, LocalDate.of(2022,1,1), true);
		String seedJson = mapper.writeValueAsString(seed);
		
		Seed expected = new Seed(1, "leek", 4, 2, LocalDate.of(2022,1,1), true);
		String expectedJson = mapper.writeValueAsString(expected);
		
		this.mvc.perform(put("/update/1").contentType(MediaType.APPLICATION_JSON).content(seedJson))
		.andExpect(status().isAccepted()).andExpect(content().json(expectedJson));
	}
	
	@Test
	void getByIdTest() throws Exception {
		Seed seed = new Seed(1, "Carrot", 6, 10, LocalDate.of(2022, 1, 1), true);
		String seedJson = this.mapper.writeValueAsString(seed);
		
		this.mvc.perform(get("/get/1")).andExpect(status().isOk()).andExpect(content().json(seedJson));
	}
}
