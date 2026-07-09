package com.coffeeshop.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.coffeeshop.menu.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    //display the list of products
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listproducts", productService.getAllProducts());
        return "menu";
    }

    // private List<Product> productsList= new ArrayList<>(List.of(
    //     new Product(1, "Expresso", 2.50),
    //     new Product(2, "Latte", 3.50),
    //     new Product(3, "Croissant", 2.00),
    //     new Product(4, "Chocolate Muffin", 2.25),
    //     new Product(5, "Americano", 2.75)
    // ));


    // @RequestMapping("/") // This maps to the URL http://localhost:8080/products/
    // @ResponseBody // directs Spring Boot to send the returned string directly as an HTTP response.
    // public String home(){
    //     return "Welcome to the Coffee Shop!";
    // }

    // @RequestMapping("/list") // This maps to the URL http://localhost:8080/products/list
    // public String listProducts(Model productListModel) { // Model argument is used to pass data to the view
    //     productListModel.addAttribute("products", productsList); // Add the productsList to the model
    //     return "menu";  // This returns the view name, that is, the JSP file name
    // }

    // @RequestMapping("/add")  // Maps to the URL http://localhost:8080/add
    // public String showProductForm(Model productAddFormModel) {
    //     productAddFormModel.addAttribute("product", new Product());  // Add a new product instance to the model
    //     return "add-new-product";
    // }
    // @PostMapping("/addNewProduct")
    // public String addProduct(Product product){
    //     productsList.add(product);
    //     System.out.println(productsList);
    //     return "redirect:/list";
    // }

    // @RequestMapping("/details/{id}")
    // @ResponseBody
    // public String getProductDetailsById(@PathVariable int id){
    //     for (Product product: productsList){
    //         if (product.getId() == id){
    //             return "<strong>Product details</strong><br><hr>Product ID: " + 
    //             product.getId() + "<br>Product name: " + product.getName() + "<br>Price: $" + product.getPrice();
    //         }
    //     }
    //     // couldn't find the product
    //     return "Product does not exist";
    // }

}
