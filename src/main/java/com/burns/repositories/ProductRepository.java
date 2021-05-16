package com.burns.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.burns.models.Product;

public interface ProductRepository extends JpaRepository<Product, String>  {
	List<Product> findByNameLike(String name);
}
