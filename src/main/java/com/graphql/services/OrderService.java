package com.graphql.services;

import com.graphql.entities.OrderEntity;
import com.graphql.entities.ProductEntity;
import com.graphql.entities.UserEntity;
import com.graphql.repositories.OrderRepository;
import com.graphql.repositories.ProductRepository;
import com.graphql.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public OrderService(OrderRepository orderRepository, UserRepository userRepository,
            ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    public OrderEntity createOrder(Long userId, List<Long> productIds) {
        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
                
        List<ProductEntity> products = productRepository.findAllById(productIds);
        OrderEntity order = new OrderEntity(null, user, products);

        return orderRepository.save(order);
    }

    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }
}
