package com.coffeeshop.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeshop.menu.model.Product;
import com.coffeeshop.menu.repository.ProductRepository;

/*The @Autowired annotation in Spring automatically injects a required dependency (a class or bean) into another class where it is needed. It saves you from manually creating or passing objects and allows Spring to handle dependency management.
The @Service annotation indicates that the class is a service component in the Spring application. */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
