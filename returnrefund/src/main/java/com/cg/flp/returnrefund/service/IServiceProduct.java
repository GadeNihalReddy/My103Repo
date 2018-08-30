package com.cg.flp.returnrefund.service;

import java.util.Optional;

import com.cg.flp.returnrefund.bean.Products;

public interface IServiceProduct {

	
	public  Optional<Products> getProductById(int id);
	public Iterable<Products> getAllProducts();
	public void updateProduct(Products p);
}
