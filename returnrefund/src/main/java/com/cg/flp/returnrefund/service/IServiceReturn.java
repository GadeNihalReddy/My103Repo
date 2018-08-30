package com.cg.flp.returnrefund.service;

import java.util.Optional;

import com.cg.flp.returnrefund.bean.Orders;

public interface IServiceReturn {
	
	public  Optional<Orders> getOrderById(int id);
	public Iterable<Orders> getAllOrders();

}
