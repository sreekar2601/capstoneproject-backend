package com.capstone.capstonebackend.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.capstonebackend.model.CustomerComplaint;

public interface CustomerComplaintRepository extends JpaRepository<CustomerComplaint,String> {

	

}
