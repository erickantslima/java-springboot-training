package com.db1group.banking.controllers;

import com.db1group.banking.models.responses.CustomerResponse;
import com.db1group.banking.services.OnboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final OnboardService onboardService;

    public CustomerController(@Autowired OnboardService onboardService) {
        this.onboardService = onboardService;
    }

    @GetMapping("/")
    public ResponseEntity<Iterable<CustomerResponse>> getCustomers() {

        return ResponseEntity.ok(onboardService.getAll());
    }
}
