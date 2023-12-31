package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring.models.Order;

public interface TradeRepository extends JpaRepository<Order, Long> {

}