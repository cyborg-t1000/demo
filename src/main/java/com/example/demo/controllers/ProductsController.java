package com.example.demo.controllers;

import com.example.demo.entities.Product;
import com.example.demo.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductsController {
    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    @RequestMapping(value = "/one/{id}", method = RequestMethod.GET)
    public String showAll(Model uiModel, @PathVariable(value = "id") int id, @ModelAttribute("product") Product product) {
        product = productsService.getProductById(id);
        uiModel.addAttribute("product", product);
        return "product";
    }

    @RequestMapping("/all")
    public String showAll(Model uiModel, @ModelAttribute("products") List<Product> products) {
        products = productsService.getAllProducts();
        uiModel.addAttribute("products", products);
        return "products";
    }
}
