package com.yash.Service;

import java.util.List;
import com.yash.dao.*;

import com.yash.model.CartItem;

public class CartServiceImpl implements CartService {
	private CartDao cartDao = new CartDaoImpl();

	@Override
	public void addCartItem(CartItem item) {
		// TODO Auto-generated method stub
		cartDao.addItem(item);
		
	}

	@Override
	public void updateCartItem(CartItem item) {
		// TODO Auto-generated method stub
		cartDao.updateItem(item);
	}

	@Override
	public void deleteCartItem(int id) {
		// TODO Auto-generated method stub
		cartDao.deleteItem(id);
	}

	@Override
	public CartItem getCartItem(int id) {
		// TODO Auto-generated method stub
		return cartDao.getItem(id);
	}

	@Override
	public List<CartItem> getAllCartItems() {
		// TODO Auto-generated method stub
		return cartDao.getAllItems();
	}
	
}
