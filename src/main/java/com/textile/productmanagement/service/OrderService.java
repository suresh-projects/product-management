package com.textile.productmanagement.service;

import com.textile.productmanagement.entity.Order;
import com.textile.productmanagement.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order placeOrder(Order order) {
        return orderRepository.save(order); // 🔥 THIS WAS MISSING
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
