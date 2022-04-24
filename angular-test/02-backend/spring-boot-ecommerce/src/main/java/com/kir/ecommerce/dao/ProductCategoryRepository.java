package com.kir.ecommerce.dao;

import com.kir.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")  // accept calls from web browser for this origin. Need for exclude an error of CORS policy
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category") // collRes = json entry name, path - link of way product category
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
