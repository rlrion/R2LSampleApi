package com.r2lsampleapi.r2lsampleapi.service;

import com.r2lsampleapi.r2lsampleapi.model.Customers;
import com.r2lsampleapi.r2lsampleapi.repository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    ApiRepository apiRepository;

    @Override
    public List<Customers> listCustomers() {
        return apiRepository.findAll();
    }

    @Override
    public Customers addCustomers(Customers request) {
        apiRepository.save(request);
        return request;
    }

    @Override
    public Boolean updateCustomers(Customers request, String id) {
        final Optional<Customers> result = apiRepository.findById(id);
        if (result.isPresent()) {
            result.get().setName(request.getName());
            apiRepository.save(result.get());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean deleteCustomers(String id) {
        final Optional<Customers> result = apiRepository.findById(id);
        if (result.isPresent()) {
            apiRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

}
