package com.yash.onlineHomeDecor.serviceimpl;

import com.yash.onlineHomeDecor.dao.ProductDao;
import com.yash.onlineHomeDecor.daoimpl.ProductDaoImpl;
import com.yash.onlineHomeDecor.domain.Product;
import com.yash.onlineHomeDecor.service.ProductService;

public class ProductServiceImpl implements ProductService {

    private ProductDao productDao=new ProductDaoImpl();
    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }
}
