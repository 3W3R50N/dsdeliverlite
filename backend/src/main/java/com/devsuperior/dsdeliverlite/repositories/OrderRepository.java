package com.devsuperior.dsdeliverlite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliverlite.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
