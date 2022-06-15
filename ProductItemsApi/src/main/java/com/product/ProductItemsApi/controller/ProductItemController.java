package com.product.ProductItemsApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.ProductItemsApi.entity.ProductItem;
import com.product.ProductItemsApi.service.ProductItemServiceImpl;

@RestController
public class ProductItemController {

	@Autowired
	private ProductItemServiceImpl productItemServices;


	@GetMapping("/products")
	List<ProductItem> getAllProducts(){
		List<ProductItem> products = productItemServices.getAllProduct();
		return products;
	}

	@PostMapping("/products")
	public ProductItem saveDepartment(
			@RequestBody ProductItem productItem)
	{
		return productItemServices.saveProduct(productItem);
	}
	
	@PutMapping("/products/{id}")
	public ProductItem updateProduct(@RequestBody ProductItem productItem,@PathVariable("id") Long departmentId)
	{
		return productItemServices.saveProduct(productItem);
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable("id") Long productId)
	{
		productItemServices.deleteProductById(productId);
		return "Product deleted successfully";
	}
}
