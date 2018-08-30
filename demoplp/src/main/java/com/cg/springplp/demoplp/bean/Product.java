package com.cg.springplp.demoplp.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="product_name")
	private String name;
	
	@Column(name="product_model")
	private String model;
	
	@Column(name="product_price")
	private BigDecimal price;

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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Product(int id, String name, String model, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
	}

	public Product() {
		super();
	}
	
	
	
}
