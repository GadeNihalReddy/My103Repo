package com.cg.flp.returnrefund.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.flp.returnrefund.bean.Orders;

@Repository
public interface IRepo extends CrudRepository<Orders, Integer>{

}
