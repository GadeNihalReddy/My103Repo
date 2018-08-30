package com.cg.flp.returnrefund.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.flp.returnrefund.bean.Orders;
import com.cg.flp.returnrefund.bean.Products;
import com.cg.flp.returnrefund.service.ServiceProductImpl;
import com.cg.flp.returnrefund.service.ServiceReturnImpl;

@RestController
public class ReturnBackEnd {

	
	@Autowired
	ServiceReturnImpl service;
	
	@Autowired
	ServiceProductImpl ser;
	
	@RequestMapping("/getOrder")
	public Optional<Orders> getOrderById(@RequestParam int id){
		return service.getOrderById(id);
	}
	@RequestMapping("/getallorders")
	public Iterable<Orders> getOrders(){
		return service.getAllOrders();
	}
	
	@RequestMapping("/getProduct")
	public Optional<Products> getProductById(@RequestParam int id){
		return ser.getProductById(id);
	}
	
	@RequestMapping("/getallproducts")
	public Iterable<Products> getProducts(){
		return ser.getAllProducts();
	}
	
}
