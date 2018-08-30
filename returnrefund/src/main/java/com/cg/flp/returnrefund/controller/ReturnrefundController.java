package com.cg.flp.returnrefund.controller;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.flp.returnrefund.bean.Orders;
import com.cg.flp.returnrefund.bean.Products;
import com.cg.flp.returnrefund.service.ServiceProductImpl;
import com.cg.flp.returnrefund.service.ServiceReturnImpl;

@Controller
public class ReturnrefundController {

	@Autowired
	ServiceReturnImpl ser;

	@Autowired
	ServiceProductImpl pro;

	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public ModelAndView showAll() {
		Iterable<Orders> ord = ser.getAllOrders();
		return new ModelAndView("show", "ord", ord);
	}

	@RequestMapping("/index")
	public String show() {
		return "index";
	}

	@RequestMapping(value = "/mod3132/{id}", method = RequestMethod.GET)
	public String getReason(@PathVariable("id") int id) {
		Optional<Orders> ordr = ser.getOrderById(id);
		LocalDate dt = ordr.get().getDate();
		System.out.println("Order date " + dt);
		LocalDate dt1 = LocalDate.now();
		System.out.println("Todays date is " + dt1);
		LocalDate d = dt.plusDays(30);
		System.out.println("Return disable date " + d);
		if (d.isAfter(dt1) || d.isEqual(dt1)) {
			Optional<Products> pro1 = pro.getProductById(id);
			Products pro2 = pro1.get();
			int k = pro2.getP_quantity() + 1;
			System.out.println(k);
			pro2.setP_quantity(k);
			pro.updateProduct(pro2);
			return "reason";
		}
		return "noreturn";
	}

	@RequestMapping("/success")
	public String getSuccess() {
		return "success";
	}

}
