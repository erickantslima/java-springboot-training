package com.db1group.banking.configs.mappers;

import com.db1group.banking.entities.CustomerEntity;
import com.db1group.banking.models.requests.CustomerRequest;
import com.db1group.banking.models.responses.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OnboardMapper {
    OnboardMapper INSTANCE = Mappers.getMapper( OnboardMapper.class );

//    @Mapping(target = "name", source = "firstName")
//    CustomerRequest customerEntityToCustomerRequest(CustomerEntity customerEntity);

    @Mapping(target = "name", source = "firstName")
    CustomerEntity customerRequestToCustomerEntity(CustomerRequest customerRequest);
    CustomerResponse customerEntityToCustomerResponse(CustomerEntity customerEntity);
    Iterable<CustomerResponse> listCustomerEntityToListCustomerResponse(Iterable<CustomerEntity> customerEntities);
}
