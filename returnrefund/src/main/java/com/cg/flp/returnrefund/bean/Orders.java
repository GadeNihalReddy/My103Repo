package com.cg.flp.returnrefund.bean;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {

	@Id
	@Column(name="Order_No")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="Product_Name")
	private String name;
	@Column(name="Purchase_Date")
	private LocalDate date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Orders(int id, String name, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	public Orders() {
		super();
	}
	
	
}
