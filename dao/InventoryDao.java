package com.yash.onlineHomeDecor.dao;

import com.yash.onlineHomeDecor.domain.Inventory;

import java.util.List;

public interface InventoryDao {
    void addInventory(Inventory inventory);
    void updateInventory(Inventory inventory);
    void deleteInventory(int inventoryId);
    Inventory getInventoryById(int inventoryId);
    List<Inventory> getAllInventories();
    List<Inventory> getInventoryWithProducts(int userId); // Optional: fetch inventory for a specific user
}
