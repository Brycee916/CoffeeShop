package com.coffeeshop.menu.service;

import java.util.List;

import com.coffeeshop.menu.model.Product;

public interface ProductService {
    List<Product> getAllProducts();
    void saveProduct(Product product);
}
