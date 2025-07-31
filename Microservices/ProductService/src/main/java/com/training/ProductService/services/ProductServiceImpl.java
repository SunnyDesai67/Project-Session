package com.training.ProductService.services;

import com.training.ProductService.entities.Product;
import com.training.ProductService.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> ProductByUserId(int userId) {
        List<Product> products = productRepository.findByUserId(userId);
        if (products == null) {
            return List.of();
        }
        return products;
    }
}
