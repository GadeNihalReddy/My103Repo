package com.cg.springplp.demoplp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cg.springplp.demoplp.bean.Product;

@Repository
public interface IProductRepo extends CrudRepository<Product, Integer> {
	

}
