package com.maddie.myspringproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "theatredetails")
public class Theatre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int theatreId;
	private String name;
	private String address;
	private int capacity;
	private int screens;
	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Theatre(int theatreId, String name, String address, int capacity, int screens) {
		super();
		this.theatreId = theatreId;
		this.name = name;
		this.address = address;
		this.capacity = capacity;
		this.screens = screens;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getScreens() {
		return screens;
	}
	public void setScreens(int screens) {
		this.screens = screens;
	}
}
