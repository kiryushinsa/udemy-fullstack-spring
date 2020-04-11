package com.kir.ecommerce.dao;

import com.kir.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")  // accept calls from web browser for this origin. Need for exclude an error of CORS policy
public interface ProductRepository extends JpaRepository<Product, Long> {


}
