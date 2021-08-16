package com.example.restprg.biz.order.repo;

import com.example.restprg.biz.order.domain.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderEntity,String> {

}
