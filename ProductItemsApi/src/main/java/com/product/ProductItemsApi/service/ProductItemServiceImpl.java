package com.product.ProductItemsApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.ProductItemsApi.entity.ProductItem;
import com.product.ProductItemsApi.repository.ProductItemRepository;

@Service
public class ProductItemServiceImpl implements ProductService {

	@Autowired
	private ProductItemRepository productItemRepository;

	public List<ProductItem> getAllProduct(){

		return productItemRepository.findAll();
	}

	public ProductItem saveProduct (ProductItem productItem ){

		return productItemRepository.save(productItem);
	}

	public ProductItem updateProduct (ProductItem productItem , Long productId){

		return productItemRepository.save(productItem);
	}
	
	public void deleteProductById (Long productId){

		productItemRepository.deleteById(productId);
		
		
	}



}
