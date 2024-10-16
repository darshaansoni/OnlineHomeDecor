package com.yash.onlinehomedecor.dao;

import java.util.List;

import com.yash.onlinehomedecor.domain.Product;

public interface ProductDAO {

	void addProduct(Product product);
	void updateProduct(Product product) throws ClassNotFoundException;
	void deleteProduct(int prodid) throws ClassNotFoundException;
	Product getProductById(int prodid);
	List<Product> getAllProduct() throws ClassNotFoundException;
}
