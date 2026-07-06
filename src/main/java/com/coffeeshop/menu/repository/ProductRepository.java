package com.coffeeshop.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffeeshop.menu.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
