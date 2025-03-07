package com.example.demo.Entity;

import com.example.demo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Varsayılan CRUD metodları sağlanacaktır
}

