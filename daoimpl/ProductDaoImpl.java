package com.yash.onlineHomeDecor.daoimpl;

import com.yash.onlineHomeDecor.dao.ProductDao;
import com.yash.onlineHomeDecor.domain.Product;
import com.yash.onlineHomeDecor.domain.ProductCategory;
import com.yash.onlineHomeDecor.domain.ProductSubCategories;
import com.yash.onlineHomeDecor.service.UserService;
import com.yash.onlineHomeDecor.serviceimpl.UserServiceImpl;
import com.yash.onlineHomeDecor.util.DBUtil;

import java.sql.*;
import java.util.Collections;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

	@Override
	public void addProduct(Product product) {
	    try {
	        String INSERT_PRODUCT = "insert into products (productName, productPrice, productDescription, productQuantity, productCategory, productSubCategories, productImage, users) values (?, ?, ?, ?, ?, ?, ?, ?)";
	        Connection connection = DBUtil.getConnection();
	        PreparedStatement ps = connection.prepareStatement(INSERT_PRODUCT);
	        ps.setString(1, product.getProductName());
	        ps.setInt(2, product.getProductPrice());
	        ps.setString(3, product.getProductDescription());
	        ps.setInt(4, product.getProductQuantity());
	        ps.setInt(5, product.getProductCategoryId());
	        ps.setInt(6, product.getProductSubCategoryId());
	        ps.setString(7, product.getProductImage());
	        ps.setInt(8, product.getUser());
	        ps.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(int productId) {

    }

    @Override
    public Product getProductById(int productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return Collections.emptyList();
    }

    @Override
    public List<ProductCategory> getProductByCategory() {
        return Collections.emptyList();
    }

    @Override
    public List<ProductSubCategories> getProductBySubCategories() {
        return Collections.emptyList();
    }
}
