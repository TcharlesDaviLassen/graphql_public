package com.graphql.controllers;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.entities.OrderEntity;
import com.graphql.entities.ProductEntity;
import com.graphql.entities.UserEntity;
import com.graphql.services.OrderService;
import com.graphql.services.ProductService;
import com.graphql.services.UserService;

import java.util.List;

@Controller
public class GrapQLController {

    private final UserService userService;
    private final OrderService orderService;
    private final ProductService productService;

    public GrapQLController(UserService userService, OrderService orderService, ProductService productService) {
        this.userService = userService;
        this.orderService = orderService;
        this.productService = productService;
    }

    // Query Mappings
    @QueryMapping
    public List<UserEntity> users() {
        return userService.getAllUsers();
    }

    @QueryMapping
    public List<ProductEntity> products() {
        return productService.getAllProducts();
    }

    @QueryMapping
    public List<OrderEntity> orders() {
        return orderService.getAllOrders();
    }

    // Mutation Mappings
    @MutationMapping
    public UserEntity createUser(@Argument String name, @Argument String email) {
        return userService.createUser(name, email);
    }

    @MutationMapping
    public ProductEntity createProduct(@Argument String name, @Argument Double price) {
        return productService.createProduct(name, price);
    }

    @MutationMapping
    public OrderEntity createOrder(@Argument Long userId, @Argument List<Long> productIds) {
        return orderService.createOrder(userId, productIds);
    }
}
