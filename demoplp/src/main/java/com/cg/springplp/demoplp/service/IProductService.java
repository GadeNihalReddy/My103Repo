package com.cg.springplp.demoplp.service;

import java.util.Optional;

import com.cg.springplp.demoplp.bean.Product;

public interface IProductService {

	public void addProduct(Product p);
	public  Optional<Product>  getProductById(int id);
	
}
