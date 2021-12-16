package com.bae.seeds.domain;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Seed {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String seedName;
	
	@Column
	private Integer sowByMonth;
	
	@Column
	private Integer harvestByMonth;
	
	@Column
	private LocalDate expirationDate;
	
	@Column
	private boolean isPlanted;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSeedName() {
		return seedName;
	}

	public void setSeedName(String seedName) {
		this.seedName = seedName;
	}

	public Integer getSowByMonth() {
		return sowByMonth;
	}

	public void setSowByMonth(Integer sowByMonth) {
		this.sowByMonth = sowByMonth;
	}

	public Integer getHarvestByMonth() {
		return harvestByMonth;
	}

	public void setHarvestByMonth(Integer harvestByMonth) {
		this.harvestByMonth = harvestByMonth;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public boolean isIsPlanted() {
		return isPlanted;
	}

	public void setIsPlanted(boolean isPlanted) {
		this.isPlanted = isPlanted;
	}

	public Seed(Integer id, String seedName, Integer sowByMonth, Integer harvestByMonth, LocalDate expirationDate,
			boolean isPlanted) {
		super();
		this.id = id;
		this.seedName = seedName;
		this.sowByMonth = sowByMonth;
		this.harvestByMonth = harvestByMonth;
		this.expirationDate = expirationDate;
		this.isPlanted = isPlanted;
	}

	@Override
	public String toString() {
		return "Seed [id=" + id + ", seedName=" + seedName + ", sowByMonth=" + sowByMonth + ", harvestByMonth="
				+ harvestByMonth + ", expirationDate=" + expirationDate + ", IsPlanted=" + isPlanted + "]";
	}

	public Seed() {
		super();
	}
		
	
	

}
