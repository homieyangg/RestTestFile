package com.educative.ecommerce.repository;

import com.educative.ecommerce.model.Cart;
import com.educative.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepo extends JpaRepository<Cart, Integer> {

    List<Cart> findAllByUserOrderByCreateDateDesc(User user);
}
