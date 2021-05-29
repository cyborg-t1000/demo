package com.example.demo.service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public Product getProductById(int id) {
        return productsRepository.GetById(id);
    }

    public List<Product> getAllProducts() {
        return productsRepository.GetAll();
    }
}
