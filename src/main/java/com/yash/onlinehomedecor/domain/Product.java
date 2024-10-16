package com.yash.onlinehomedecor.domain;

public class Product {
	
	private int prodid;
	private String prodname;
	private String description;
	private  double price;
	private String category;
	private int stock;
	
	public Product() {
		
	}
	public Product(int prodid, String prodname, String description, double price, String category, int stock) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.description = description;
		this.price = price;
		this.category = category;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", description=" + description + ", price="
				+ price + ", category=" + category + ", stock=" + stock + "]";
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
