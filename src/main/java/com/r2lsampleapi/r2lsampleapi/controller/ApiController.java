package com.r2lsampleapi.r2lsampleapi.controller;

import com.r2lsampleapi.r2lsampleapi.model.Customers;
import com.r2lsampleapi.r2lsampleapi.response.ResponseHandler;
import com.r2lsampleapi.r2lsampleapi.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    ApiService apiService;

    @GetMapping(path = "/list-customers")
    public ResponseEntity<Object> listCustomers() {
        return ResponseHandler.responseBuilder("list-customers", HttpStatus.OK, apiService.listCustomers());
    }

    @PostMapping(path = "/add-customers")
    public ResponseEntity<Object> addCustomers(@RequestBody Customers request) {
        return ResponseHandler.responseBuilder("add-customers", HttpStatus.OK, apiService.addCustomers(request));
    }

    @PutMapping(path = "/update-customers/{id}")
    public ResponseEntity<Object> updateCustomers(@RequestBody Customers request, @PathVariable String id) {
        return ResponseHandler.responseBuilder("update-customers", HttpStatus.OK, apiService.updateCustomers(request, id));
    }

    @DeleteMapping(path = "/delete-customers/{id}")
    public ResponseEntity<Object> deleteCustomers(@PathVariable String id) {
        return ResponseHandler.responseBuilder("delete-customers", HttpStatus.OK, apiService.deleteCustomers(id));
    }

}
