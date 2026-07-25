package com.nabilla.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nabilla.order.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
