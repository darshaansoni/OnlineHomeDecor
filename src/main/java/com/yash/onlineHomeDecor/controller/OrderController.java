package com.yash.onlineHomeDecor.controller;

import com.yash.onlineHomeDecor.domain.Order;
import com.yash.onlineHomeDecor.exception.OrderException;
import com.yash.onlineHomeDecor.service.OrderService;
import com.yash.onlineHomeDecor.serviceimpl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/order/*")
public class OrderController extends HttpServlet {
    private OrderService orderService;
    private Order order;
    @Override
    public void init() {
        orderService = new OrderServiceImpl();
        order=new Order();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pathInfo = request.getPathInfo();

        try {
            switch (pathInfo) {
                case "/create":

                    orderService.createOrder(order);
                    break;
                case "/update":
                    orderService.updateOrder(order);
                    break;
                case "/delete":
                    orderService.deleteOrder(101L);
                    break;
                default:
                    response.sendError(HttpServletResponse.SC_NOT_FOUND);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pathInfo = request.getPathInfo();

//        try {
//            switch (pathInfo) {
//                case "/view":
//                    orderService.viewOrder();
//                    break;
//                case "/user-orders":
//                    orderService.getUserOrders(101L);
//                    break;
//                default:
//                    response.sendError(HttpServletResponse.SC_NOT_FOUND);
//            }
//        } catch (OrderException e) {
//            handleError(response, e);
//        }....................yet to be implemented
    }

//    private void createOrder(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException, OrderException {
//        // Implementation due
//    }


}