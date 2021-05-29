package com.example.demo.repositories;

import com.example.demo.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsRepository {
    List<Product> products;

    public ProductsRepository() {
        this.products = new ArrayList<>();
        products.add(new Product(1, "Product 1", 11.5f));
        products.add(new Product(2, "Product 2", 12.5f));
        products.add(new Product(3, "Product 3", 13.5f));
    }

    public Product GetById(int id) {
        for (Product p: products) {
            if(p.getId() == id) return p;
        }
        return null;
    }

    public List<Product> GetAll() {
        return products;
    }
}
