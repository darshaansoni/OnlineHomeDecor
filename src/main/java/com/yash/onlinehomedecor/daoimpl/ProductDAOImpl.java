package com.yash.onlinehomedecor.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yash.onlinehomedecor.dao.ProductDAO;
import com.yash.onlinehomedecor.domain.Product;
import com.yash.onlinehomedecor.util.DBUtil;


public class ProductDAOImpl implements ProductDAO {

	@Override
	public void addProduct(Product product) {
		  try {
			  Connection con = DBUtil.getConnection();
		  
			         PreparedStatement ps = con.prepareStatement("INSERT INTO product (prodname, description, price,category,stock) VALUES (?,?,?,?,?)");
				ps.setString(1, product.getProdname());
				ps.setString(2, product.getDescription());
				ps.setDouble(3, product.getPrice());
				ps.setString(4, product.getcategory());
				ps.setInt(5, product.getStock());
				ps.executeUpdate();
				  
		  }catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void updateProduct(Product product) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
	
	}

	@Override
	public void deleteProduct(int prodid) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			 Connection con = DBUtil.getConnection();
			 PreparedStatement ps=con.prepareStatement("delete from product where prodid=?");
			 ps.setInt(1, prodid);
			 
			ps.executeUpdate();
		}catch (SQLException e) {
			// TODO: handle exception
		}
		
		 
		
	}

	@Override
	public Product getProductById(int prodid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() throws ClassNotFoundException {
	    List<Product> products = new ArrayList<>();
	    
	    try (Connection con = DBUtil.getConnection();
	         PreparedStatement ps = con.prepareStatement("select * from product");
	         ResultSet rs = ps.executeQuery()) {
	        while (rs.next()) {
	            products.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getInt(6)));
	        }
	    } catch (SQLException e) {
	       
	        e.printStackTrace();
	        
	    }
	    
	    return products;
	}
		
	}


