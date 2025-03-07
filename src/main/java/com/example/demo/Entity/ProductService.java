package com.example.demo.Entity;

import com.example.demo.Entity.Product;
import com.example.demo.Entity.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    
    public Product saveProduct(Product product) {
        System.out.println("Saving product: " + product.getName() + " with price: " + product.getPrice());  // Hata ayıklama amaçlı
        return productRepository.save(product);


    }
}
