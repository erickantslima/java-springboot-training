package com.db1group.banking.models.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AddressRequest {
    @NotNull
    private String cep;

    @NotNull
    private String neighborhood;

    @NotNull
    private String residenceNumber;

    @NotNull
    private String city;

    @NotNull
    @Size(min = 2, max = 2)
    private String uf;

    @NotNull
    private String publicPlace;

    @NotNull
    private String additionalInformation;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getResidenceNumber() {
        return residenceNumber;
    }

    public void setResidenceNumber(String residenceNumber) {
        this.residenceNumber = residenceNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }
}
