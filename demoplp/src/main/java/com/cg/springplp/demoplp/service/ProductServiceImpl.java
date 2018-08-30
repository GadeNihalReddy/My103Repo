package com.cg.springplp.demoplp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springplp.demoplp.bean.Product;
import com.cg.springplp.demoplp.repo.IProductRepo;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductRepo productRepo;
	
	@Override
	public  Optional<Product> getProductById(int id) {
		return productRepo.findById(id);
		
	}
	public void addProduct(Product p) {
		productRepo.save(p);
	}
	
	/*public List<Product> getAllProducts(){
		List<Product> products =new ArrayList<>();
		productRepo.findAll().forEach(products::add);
		return products;
	}
	
	
	public void updateProduct(Product p,String id) {
		productRepo.save(p);
	}
	public void deleteProduct(String id)
	{
		productRepo.deleteById(id);
	}*/

}
