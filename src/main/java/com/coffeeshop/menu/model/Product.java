package com.coffeeshop.menu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity //so JPA recognizes this class as an entity that should be mapped to a database table
@Table(name="Products") //table name in database if different from class name. can also specify table name in the @Entity annotation, but @Table is more explicit and clear.
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //GenerationType.IDENTITY: Relies on the database's auto-increment feature to generate primary key values.
    private int id;

    @NotNull(message="Product name cannot be null")
    @Size(min=2, max=50, message="Product name must be between 2 and 50 characters")
    private String name;
    
    @NotNull(message="Product must have a price")
    @Min(value=1, message="Product must have a minimum price of $1")
    private double price;

    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
        
    }
    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

}
