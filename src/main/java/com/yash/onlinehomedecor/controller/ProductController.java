package com.yash.onlinehomedecor.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.onlinehomedecor.dao.ProductDAO;
import com.yash.onlinehomedecor.daoimpl.ProductDAOImpl;
import com.yash.onlinehomedecor.domain.Product;





@WebServlet("/productcontroller")
public class ProductController extends HttpServlet{

          ProductDAO productDao;
          
          public void init() {
        	 // System.out.println("in init");
        	  productDao=new ProductDAOImpl();
          }
          
          public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        	 
        	//  System.out.println("in get product");
        		   
        		   List<Product> listProducts=new ArrayList<>();
             	//  System.out.println("in get product" + listProducts.size());

				try {
					listProducts = productDao.getAllProduct();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		   if(listProducts==null || listProducts.isEmpty()) {
        			   req.setAttribute("error", "No Product Found");
        		   }else {
        		   req.setAttribute("listProduct", listProducts);
        		   RequestDispatcher dispature=req.getRequestDispatcher("showProduct.jsp");
        		   dispature.forward(req, res);
        	   }
        	   }
 
          public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        	  String prodname = req.getParameter("prodname");
              String description = req.getParameter("description");
              double price = Double.parseDouble(req.getParameter("price"));
              String category = req.getParameter("category");
              int stock = Integer.parseInt(req.getParameter("stock"));
              Product product = new Product();
              product.setProdname(prodname);
              product.setDescription(description);
              product.setPrice(price);
              product.setcategory(category);
              product.setStock(stock);
              productDao.addProduct(product);
             res.sendRedirect("./productcontroller");
}  
          
           public void  deleteProduct(HttpServletRequest req, HttpServletResponse res) throws IOException, ClassNotFoundException {
        	   int prodid1=Integer.parseInt(req.getParameter("prodid"));
        	 System.out.println("Received ProdId:"+prodid1);
        	   if(prodid1> 0) {
        		   try {
        			   productDao.deleteProduct(prodid1);
                	   res.sendRedirect("./productcontroller");
        		   }catch(Exception e) {
        			   e.printStackTrace();
        		   }
        	   }
        	   
        	  
        	   
           }
}