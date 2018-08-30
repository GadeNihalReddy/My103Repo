package com.cg.flp.returnrefund.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int p_id;
	private String p_name;
	private double p_price;
	private int p_quantity;
	
	public int getP_quantity() {
		return p_quantity;
	}
	public void setP_quantity(int p_quantity) {
		this.p_quantity = p_quantity;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public double getP_price() {
		return p_price;
	}
	public void setP_price(double p_price) {
		this.p_price = p_price;
	}
	public Products(int p_id, String p_name, double p_price, int p_quantity) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_quantity = p_quantity;
	}
	public Products() {
		super();
	}
	
	
	
	
}
