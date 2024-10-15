package com.yash.onlineHomeDecor.dao;

import com.yash.onlineHomeDecor.domain.Product;
import com.yash.onlineHomeDecor.domain.ProductCategory;
import com.yash.onlineHomeDecor.domain.ProductSubCategories;

import java.util.List;

public interface ProductDao {

    public void addProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(int productId);
    public Product getProductById(int productId);
    public List<Product> getAllProducts();
    public List<ProductCategory> getProductByCategory();
    public List<ProductSubCategories> getProductBySubCategories();

}
