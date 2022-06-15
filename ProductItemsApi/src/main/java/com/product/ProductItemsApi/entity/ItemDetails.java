package com.product.ProductItemsApi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items_table")
public class ItemDetails {
	
	
	@Id
	private long itemDetailsId;
	
	private long productId;
	
	private String detailDescription;
	
	private double price;
	
	public long getItemDetailsId() {
		return itemDetailsId;
	}
	public void setItemDetailsId(long itemDetailsId) {
		this.itemDetailsId = itemDetailsId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getDetailDescription() {
		return detailDescription;
	}
	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	


}


