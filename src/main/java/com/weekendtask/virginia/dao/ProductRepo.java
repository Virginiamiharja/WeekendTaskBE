package com.weekendtask.virginia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weekendtask.virginia.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
