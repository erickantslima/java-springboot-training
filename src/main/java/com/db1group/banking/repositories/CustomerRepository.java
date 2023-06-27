package com.db1group.banking.repositories;

import com.db1group.banking.entities.CustomerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {

    @Query("SELECT c FROM CustomerEntity c WHERE c.documents.securityNumber = " +
            "COALESCE(:securityNumber, c.documents.securityNumber)" +
            "AND c.documents.rgDocument = COALESCE(:rgDocument, c.documents.rgDocument)")
    Iterable<CustomerEntity> filterBySecurityNumberAndRgDocument(@Param("securityNumber") String securityNumber,
                                                                 @Param("rgDocument") String rgDocument);
}
