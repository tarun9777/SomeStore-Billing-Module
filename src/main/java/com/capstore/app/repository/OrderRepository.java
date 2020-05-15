package com.capstore.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstore.app.models.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
