package com.femtech.SpeedBill.service;

import com.femtech.SpeedBill.model.Product;
import com.femtech.SpeedBill.repository.ProductRepository;
import com.femtech.SpeedBill.serviceImpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductServiceImpl {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

//    public List<Product> getAllProducts() {
//        return productRepository.findAll();
//    }
}
