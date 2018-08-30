package com.cg.flp.returnrefund.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.flp.returnrefund.bean.Products;

@Repository
public interface IRepoProduct extends CrudRepository<Products, Integer>{

	void save(int k);

}
