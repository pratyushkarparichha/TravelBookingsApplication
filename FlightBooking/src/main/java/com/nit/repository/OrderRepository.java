package com.nit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nit.pojo.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
	Order findByRazorpayOrderId(String orderId);
}
