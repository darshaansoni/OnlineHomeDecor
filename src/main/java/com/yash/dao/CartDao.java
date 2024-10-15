package com.yash.dao;

import java.util.List;

import com.yash.model.CartItem;

public interface CartDao {
	void addItem(CartItem item);
	void updateItem(CartItem item);
	void deleteItem(int id);
	CartItem getItem(int id);
	List<CartItem> getAllItems();

}
