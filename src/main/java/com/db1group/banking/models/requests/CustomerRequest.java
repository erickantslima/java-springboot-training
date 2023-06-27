package com.db1group.banking.models.requests;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CustomerRequest {
    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private Date birthDate;

    @NotNull
    private String motherName;

    @NotNull
    private String fatherName;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    private String cellPhoneNumber;

    @NotNull
    private BigDecimal monthlyIncome;

    @NotNull
    private DocumentsRequest documents;

    @NotNull
    private List<AddressRequest> addresses;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(BigDecimal monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public DocumentsRequest getDocuments() {
        return documents;
    }

    public void setDocuments(DocumentsRequest documents) {
        this.documents = documents;
    }

    public List<AddressRequest> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressRequest> addresses) {
        this.addresses = addresses;
    }
}
