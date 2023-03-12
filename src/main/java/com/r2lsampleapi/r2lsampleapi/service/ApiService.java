package com.r2lsampleapi.r2lsampleapi.service;

import com.r2lsampleapi.r2lsampleapi.model.Customers;

import java.util.List;

public interface ApiService {

    List<Customers> listCustomers();

    Customers addCustomers(Customers request);

    Boolean updateCustomers(Customers request, String id);

    Boolean deleteCustomers(String id);

}
