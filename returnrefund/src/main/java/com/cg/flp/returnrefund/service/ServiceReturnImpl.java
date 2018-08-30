package com.cg.flp.returnrefund.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.flp.returnrefund.bean.Orders;
import com.cg.flp.returnrefund.repo.IRepo;

@Service
public class ServiceReturnImpl implements IServiceReturn {

	@Autowired
	IRepo orderRepo;
	
	@Override
	public Iterable<Orders> getAllOrders() {
		
		return orderRepo.findAll();
	}

	@Override
	public Optional<Orders> getOrderById(int id) {
		// TODO Auto-generated method stub
		return orderRepo.findById(id);
	}

	
}
