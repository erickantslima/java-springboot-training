package com.db1group.banking.services;

import com.db1group.banking.configs.mappers.OnboardMapper;
import com.db1group.banking.models.requests.CustomerRequest;
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

    public Iterable<CustomerResponse> filterCustomers(String securityNumber, String rgDocument) {
        var customersFetched = customerRepository.filterBySecurityNumberAndRgDocument(securityNumber, rgDocument);
        var customersResponse = OnboardMapper.INSTANCE.listCustomerEntityToListCustomerResponse(customersFetched);

        return customersResponse;
    }

    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        var newCustomer = OnboardMapper.INSTANCE.customerRequestToCustomerEntity(customerRequest);

        newCustomer.getDocuments().setCustomer(newCustomer);
        newCustomer.getAddresses().get(0).setCustomer(newCustomer);

        var savedCustomer = customerRepository.save(newCustomer);

        return OnboardMapper.INSTANCE.customerEntityToCustomerResponse(savedCustomer);
    }
}
