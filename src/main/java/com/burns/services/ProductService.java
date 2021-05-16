package com.burns.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.burns.models.Product;
import com.burns.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository rep;
	
	public List<Product> getProduct() {
		return rep.findAll();
	}

	public Optional<Product> getProductById(String id) {
		return rep.findById(id);
	}

	public List<Product> getProductByName(String name) {
		return rep.findByNameLike(name);
	}

	public Product save(Product product) {
		return rep.save(product);
	}

	public Product update(String id, Product product) {
		Optional<Product> a = rep.findById(id);
		if(a.isPresent()) {
			Product db = a.get();
			db.setName(product.getName());
			db.setProductId(product.getProductId());
			db.setPrice(product.getPrice());
			
			rep.save(db);
			
			return db;
		} else {
			throw new RuntimeException("Não foi possível atualizar o registro");
		}
	}

	public void delete(String id) {
		Optional<Product> a = rep.findById(id);
		if(a.isPresent()) {
			rep.deleteById(id);
		} else {
			throw new RuntimeException("Não foi possível remover o registro");
		}
	}
	
	
}
