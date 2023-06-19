package com.db1group.banking.configs.mappers;

import com.db1group.banking.entities.CustomerEntity;
import com.db1group.banking.models.responses.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OnboardMapper {
    OnboardMapper INSTANCE = Mappers.getMapper( OnboardMapper.class );

    Iterable<CustomerResponse> listCustomerEntityToListCustomerResponse(Iterable<CustomerEntity> customerEntities);
}
