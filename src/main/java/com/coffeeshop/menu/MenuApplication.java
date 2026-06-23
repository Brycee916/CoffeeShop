package com.coffeeshop.menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coffeeshop.menu.model.Product;

@SpringBootApplication
public class MenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuApplication.class, args);

		Product expresso = new Product(1, "Expresso", 2.99);
		Product croissant = new Product(2, "Croissant", 3.49);

		System.out.println("Product ID: " + expresso.getId() + "Name: " + expresso.getName() + "Price: " + expresso.getPrice());
		System.out.println("Product ID: " + croissant.getId() + "Name: " + croissant.getName() + "Price: " + croissant.getPrice());
	}

}
