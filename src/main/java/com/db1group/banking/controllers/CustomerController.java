package com.db1group.banking.controllers;

import com.db1group.banking.models.requests.CustomerRequest;
import com.db1group.banking.models.responses.CustomerResponse;
import com.db1group.banking.services.OnboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final OnboardService onboardService;

    public CustomerController(@Autowired OnboardService onboardService) {
        this.onboardService = onboardService;
    }

    @GetMapping("/")
    public ResponseEntity<Iterable<CustomerResponse>> getCustomers(
            @RequestParam(required = false) String securityNumber,
            @RequestParam(required = false) String rgDocument
    ) {
        return ResponseEntity.ok(onboardService.filterCustomers(securityNumber, rgDocument));
    }

    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(
            @RequestBody CustomerRequest customerRequest
    ) {
        var result = onboardService.createCustomer(customerRequest);

        return ResponseEntity.ok(result);
    }
}
