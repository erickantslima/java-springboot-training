package com.db1group.banking.configs.mappers;

import com.db1group.banking.entities.AddressEntity;
import com.db1group.banking.entities.CustomerEntity;
import com.db1group.banking.entities.DocumentsEntity;
import com.db1group.banking.models.requests.AddressRequest;
import com.db1group.banking.models.requests.CustomerRequest;
import com.db1group.banking.models.requests.DocumentsRequest;
import com.db1group.banking.models.responses.AddressResponse;
import com.db1group.banking.models.responses.CustomerResponse;
import com.db1group.banking.models.responses.DocumentsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-27T17:47:39-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (BellSoft)"
)
public class OnboardMapperImpl implements OnboardMapper {

    @Override
    public CustomerEntity customerRequestToCustomerEntity(CustomerRequest customerRequest) {
        if ( customerRequest == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setName( customerRequest.getFirstName() );
        customerEntity.setLastName( customerRequest.getLastName() );
        customerEntity.setBirthDate( customerRequest.getBirthDate() );
        customerEntity.setMotherName( customerRequest.getMotherName() );
        customerEntity.setFatherName( customerRequest.getFatherName() );
        customerEntity.setEmail( customerRequest.getEmail() );
        customerEntity.setPassword( customerRequest.getPassword() );
        customerEntity.setCellPhoneNumber( customerRequest.getCellPhoneNumber() );
        customerEntity.setMonthlyIncome( customerRequest.getMonthlyIncome() );
        customerEntity.setDocuments( documentsRequestToDocumentsEntity( customerRequest.getDocuments() ) );
        customerEntity.setAddresses( addressRequestListToAddressEntityList( customerRequest.getAddresses() ) );

        return customerEntity;
    }

    @Override
    public CustomerResponse customerEntityToCustomerResponse(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        CustomerResponse customerResponse = new CustomerResponse();

        customerResponse.setId( customerEntity.getId() );
        customerResponse.setName( customerEntity.getName() );
        customerResponse.setLastName( customerEntity.getLastName() );
        customerResponse.setBirthDate( customerEntity.getBirthDate() );
        customerResponse.setMotherName( customerEntity.getMotherName() );
        customerResponse.setFatherName( customerEntity.getFatherName() );
        customerResponse.setEmail( customerEntity.getEmail() );
        customerResponse.setPassword( customerEntity.getPassword() );
        customerResponse.setCellPhoneNumber( customerEntity.getCellPhoneNumber() );
        customerResponse.setMonthlyIncome( customerEntity.getMonthlyIncome() );
        customerResponse.setDocuments( documentsEntityToDocumentsResponse( customerEntity.getDocuments() ) );
        customerResponse.setAddresses( addressEntityListToAddressResponseList( customerEntity.getAddresses() ) );

        return customerResponse;
    }

    @Override
    public Iterable<CustomerResponse> listCustomerEntityToListCustomerResponse(Iterable<CustomerEntity> customerEntities) {
        if ( customerEntities == null ) {
            return null;
        }

        ArrayList<CustomerResponse> iterable = new ArrayList<CustomerResponse>();
        for ( CustomerEntity customerEntity : customerEntities ) {
            iterable.add( customerEntityToCustomerResponse( customerEntity ) );
        }

        return iterable;
    }

    protected DocumentsEntity documentsRequestToDocumentsEntity(DocumentsRequest documentsRequest) {
        if ( documentsRequest == null ) {
            return null;
        }

        DocumentsEntity documentsEntity = new DocumentsEntity();

        documentsEntity.setSecurityNumber( documentsRequest.getSecurityNumber() );
        documentsEntity.setRgDocument( documentsRequest.getRgDocument() );
        documentsEntity.setIssuingInstitution( documentsRequest.getIssuingInstitution() );
        documentsEntity.setUf( documentsRequest.getUf() );

        return documentsEntity;
    }

    protected AddressEntity addressRequestToAddressEntity(AddressRequest addressRequest) {
        if ( addressRequest == null ) {
            return null;
        }

        AddressEntity addressEntity = new AddressEntity();

        addressEntity.setCep( addressRequest.getCep() );
        addressEntity.setNeighborhood( addressRequest.getNeighborhood() );
        addressEntity.setResidenceNumber( addressRequest.getResidenceNumber() );
        addressEntity.setCity( addressRequest.getCity() );
        addressEntity.setUf( addressRequest.getUf() );
        addressEntity.setPublicPlace( addressRequest.getPublicPlace() );
        addressEntity.setAdditionalInformation( addressRequest.getAdditionalInformation() );

        return addressEntity;
    }

    protected List<AddressEntity> addressRequestListToAddressEntityList(List<AddressRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<AddressEntity> list1 = new ArrayList<AddressEntity>( list.size() );
        for ( AddressRequest addressRequest : list ) {
            list1.add( addressRequestToAddressEntity( addressRequest ) );
        }

        return list1;
    }

    protected DocumentsResponse documentsEntityToDocumentsResponse(DocumentsEntity documentsEntity) {
        if ( documentsEntity == null ) {
            return null;
        }

        DocumentsResponse documentsResponse = new DocumentsResponse();

        documentsResponse.setSecurityNumber( documentsEntity.getSecurityNumber() );
        documentsResponse.setRgDocument( documentsEntity.getRgDocument() );
        documentsResponse.setIssuingInstitution( documentsEntity.getIssuingInstitution() );
        documentsResponse.setUf( documentsEntity.getUf() );

        return documentsResponse;
    }

    protected AddressResponse addressEntityToAddressResponse(AddressEntity addressEntity) {
        if ( addressEntity == null ) {
            return null;
        }

        AddressResponse addressResponse = new AddressResponse();

        addressResponse.setId( addressEntity.getId() );
        addressResponse.setCep( addressEntity.getCep() );
        addressResponse.setNeighborhood( addressEntity.getNeighborhood() );
        addressResponse.setResidenceNumber( addressEntity.getResidenceNumber() );
        addressResponse.setCity( addressEntity.getCity() );
        addressResponse.setUf( addressEntity.getUf() );
        addressResponse.setPublicPlace( addressEntity.getPublicPlace() );
        addressResponse.setAdditionalInformation( addressEntity.getAdditionalInformation() );

        return addressResponse;
    }

    protected List<AddressResponse> addressEntityListToAddressResponseList(List<AddressEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<AddressResponse> list1 = new ArrayList<AddressResponse>( list.size() );
        for ( AddressEntity addressEntity : list ) {
            list1.add( addressEntityToAddressResponse( addressEntity ) );
        }

        return list1;
    }
}
