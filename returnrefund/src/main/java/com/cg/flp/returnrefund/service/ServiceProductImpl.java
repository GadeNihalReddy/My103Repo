package com.cg.flp.returnrefund.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flp.returnrefund.bean.Products;
import com.cg.flp.returnrefund.repo.IRepoProduct;

@Service
public class ServiceProductImpl implements IServiceProduct {

	@Autowired
	IRepoProduct prod;

	@Override
	public Optional<Products> getProductById(int id) {

		return prod.findById(id);
	}

	@Override
	public void updateProduct(Products p) {

		prod.save(p);

	}

	@Override
	public Iterable<Products> getAllProducts() {

		return prod.findAll();
	}

}
