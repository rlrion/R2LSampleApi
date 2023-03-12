package com.r2lsampleapi.r2lsampleapi.repository;

import com.r2lsampleapi.r2lsampleapi.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRepository extends JpaRepository<Customers, String> {
}
