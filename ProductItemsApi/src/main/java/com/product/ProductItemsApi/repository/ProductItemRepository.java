package com.product.ProductItemsApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.ProductItemsApi.entity.ProductItem;

@Repository
public interface ProductItemRepository extends JpaRepository<ProductItem, Long>{
	
	

}
