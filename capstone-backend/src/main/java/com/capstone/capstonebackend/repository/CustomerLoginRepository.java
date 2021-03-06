package com.capstone.capstonebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.capstonebackend.model.CustomerLogin;

@Repository
public interface CustomerLoginRepository extends JpaRepository<CustomerLogin,String>{

	CustomerLogin findByusername(String username);

}
