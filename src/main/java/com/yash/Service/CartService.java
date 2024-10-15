package com.yash.Service;

import java.util.List;

import com.yash.model.CartItem;


public interface CartService {
void addCartItem(CartItem item);
void updateCartItem(CartItem item);
void deleteCartItem(int id);
CartItem getCartItem(int id);
List<CartItem> getAllCartItems();

}
