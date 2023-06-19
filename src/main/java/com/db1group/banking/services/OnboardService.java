package com.db1group.banking.services;

import com.db1group.banking.configs.mappers.OnboardMapper;
import com.db1group.banking.models.responses.CustomerResponse;
import com.db1group.banking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OnboardService {

    private final CustomerRepository customerRepository;

    public OnboardService(@Autowired CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Iterable<CustomerResponse> getAll() {
        var customersFetched = customerRepository.findAll();
        var customersResponse = OnboardMapper.INSTANCE.listCustomerEntityToListCustomerResponse(customersFetched);

        return customersResponse;
    }
}
