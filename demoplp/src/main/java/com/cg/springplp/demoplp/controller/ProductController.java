package com.cg.springplp.demoplp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springplp.demoplp.bean.Product;
import com.cg.springplp.demoplp.service.IProductService;

@RestController
public class ProductController {

	@Autowired
	IProductService service;
	
	@RequestMapping("/getproducts")
	public Optional<Product> getProductById(@RequestParam int id){
		return service.getProductById(id);
	}
	
	
}
