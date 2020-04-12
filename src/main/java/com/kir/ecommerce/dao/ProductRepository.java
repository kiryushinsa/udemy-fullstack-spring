package com.kir.ecommerce.dao;

import com.kir.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.data.domain.Pageable;



@CrossOrigin("http://localhost:4200")  // accept calls from web browser for this origin. Need for exclude an error of CORS policy
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable); //behind this equals SELECT * FROM product where category_id=?
    // spring data rest loc:8080/api/products/searc/findByCategory?id=3 print all from category 3 in database


}
