package com.burns.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.burns.models.Product;
import com.burns.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping()
	public List<Product> findAll() {
		return service.getProduct();
	}
	
	@GetMapping("/{id}")
	public Optional<Product> findById(@PathVariable("id") String id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/nome/{name}")
	public List<Product> findByName(@PathVariable("name") String name) {
		return service.getProductByName("%" + name + "%");
	}
		
	@PostMapping
	public String post(@RequestBody Product product) {
		Product a = service.save(product);
		
		return "Cadastro realizado com sucesso: " + a.getName();
	}
	
	@PutMapping("/{id}")
	public String put(@PathVariable("id") String id, @RequestBody Product product) {
		Product a = service.update(id, product);
		
		return "Atualização realizada com sucesso: " + a.getName();
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") String id) {
		service.delete(id);
		
		return "Cadastro removido com sucesso!";
	}
}
