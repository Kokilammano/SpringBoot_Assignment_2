package com.abc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.model.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers,Integer> {
}
