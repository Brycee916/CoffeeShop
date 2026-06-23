package com.coffeeshop.menu.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coffeeshop.menu.model.Product;

@Controller
@RequestMapping("/products") // This means all URLs start with http://localhost:8080/products/
public class ProductController {

    private final List<Product> productsList= List.of(
        new Product(1, "Expresso", 2.50),
        new Product(2, "Latte", 3.50),
        new Product(3, "Croissant", 2.00),
        new Product(4, "Chocolate Muffin", 2.25),
        new Product(5, "Americano", 2.75)
    );

    @RequestMapping("/") // This maps to the URL http://localhost:8080/products/
    @ResponseBody // directs Spring Boot to send the returned string directly as an HTTP response.
    public String home(){
        return "Welcome to the Coffee Shop!";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String listProducts(){
        String productDisplay = "<strong>Product List:</strong> <hr>";
        for (Product product: productsList){
            productDisplay += "Product: " + product.getId() + " - " + product.getName() + " - $" + product.getPrice() + "<br>";
        }
        return productDisplay;
    }

    @RequestMapping("/details/{id}")
    @ResponseBody
    public String getProductDetailsById(@PathVariable int id){
        for (Product product: productsList){
            if (product.getId() == id){
                return "<strong>Product details</strong><br><hr>Product: " + product.getId() + " - " + product.getName() + " - $" + product.getPrice();
            }
        }
        // couldn't find the product
        return "Product does not exist";
    }

}
