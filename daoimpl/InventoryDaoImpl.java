package com.yash.onlineHomeDecor.daoimpl;

import com.yash.onlineHomeDecor.dao.InventoryDao;
import com.yash.onlineHomeDecor.domain.Inventory;
import com.yash.onlineHomeDecor.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryDaoImpl implements InventoryDao {

    @Override
    public void addInventory(Inventory inventory) {
        String query = "INSERT INTO inventory (productId, quantity, lastUpdateDate) VALUES (?, ?, ?)";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, inventory.getProductId());
            ps.setInt(2, inventory.getQuantity());
            ps.setDate(3, new Date(inventory.getLastUpdateDate().getTime()));
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateInventory(Inventory inventory) {
        String query = "UPDATE inventory SET quantity = ?, lastUpdateDate = ? WHERE inventoryId = ?";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, inventory.getQuantity());
            ps.setDate(2, new Date(inventory.getLastUpdateDate().getTime()));
            ps.setInt(3, inventory.getInventoryId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteInventory(int inventoryId) {
        String query = "DELETE FROM inventory WHERE inventoryId = ?";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, inventoryId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Inventory getInventoryById(int inventoryId) {
        String query = "SELECT * FROM inventory WHERE inventoryId = ?";
        Inventory inventory = null;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, inventoryId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                inventory = new Inventory();
                inventory.setInventoryId(rs.getInt("inventoryId"));
                inventory.setProductId(rs.getInt("productId"));
                inventory.setQuantity(rs.getInt("quantity"));
                inventory.setLastUpdateDate(rs.getDate("lastUpdateDate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return inventory;
    }

    @Override
    public List<Inventory> getAllInventories() {
        List<Inventory> inventoryList = new ArrayList<>();
        String query = "SELECT * FROM inventory";

        try (Connection connection = DBUtil.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Inventory inventory = new Inventory();
                inventory.setInventoryId(rs.getInt("inventoryId"));
                inventory.setProductId(rs.getInt("productId"));
                inventory.setQuantity(rs.getInt("quantity"));
                inventory.setLastUpdateDate(rs.getDate("lastUpdateDate"));
                inventoryList.add(inventory);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return inventoryList;
    }

    @Override
    public List<Inventory> getInventoryWithProducts(int userId) {
        // Implementation as shown in the previous answer
        return new ArrayList<>();
    }
}
