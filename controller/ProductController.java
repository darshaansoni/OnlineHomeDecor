package com.yash.onlineHomeDecor.controller;

import com.yash.onlineHomeDecor.domain.Product;
import com.yash.onlineHomeDecor.domain.ProductCategory;
import com.yash.onlineHomeDecor.domain.ProductSubCategories;
import com.yash.onlineHomeDecor.domain.User;
import com.yash.onlineHomeDecor.service.ProductService;
import com.yash.onlineHomeDecor.service.UserService;
import com.yash.onlineHomeDecor.serviceimpl.ProductServiceImpl;
import com.yash.onlineHomeDecor.serviceimpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/product/*")
public class ProductController extends HttpServlet {

    private ProductService productService=new ProductServiceImpl();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	PrintWriter out=resp.getWriter();
    	System.out.println("In Method");
    	out.println("In Get");
    	
    }
    
   

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        System.out.println("out Method");
        out.println("In Out");
        addProduct(req, resp);
    }

    //addProduct
    private void addProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter out=response.getWriter();
    	
    	String productName=request.getParameter("prodcutName");
      int productPrice=Integer.parseInt( request.getParameter("productPrice"));
      String productDescription=request.getParameter("productDescription");
      int productQuantity=Integer.parseInt( request.getParameter("productQuantity"));
      int productCategoryId=Integer.parseInt(request.getParameter("productCategoryId"));
      int productSubCategoriesId=Integer.parseInt(request.getParameter("productSubCategoryId"));
      String productImage=request.getParameter("productImage");
      int userId=Integer.parseInt( request.getParameter("userId"));

        Product p = new Product();
        p.setProductName(productName);
        p.setProductPrice(productPrice);
        p.setProductDescription(productDescription);
        p.setProductQuantity(productQuantity);
        p.setProductCategoryId(productCategoryId);
        p.setProductSubCategoryId(productSubCategoriesId);
        p.setUser(userId);
        p.setProductImage(productImage);

        try {
            productService.addProduct(p);
            out.println("Product added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            out.println("Error adding product: " + e.getMessage());
        }
    }


}
