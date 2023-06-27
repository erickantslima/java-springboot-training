package com.db1group.banking.models.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class DocumentsRequest {
    @NotNull
    private String securityNumber;

    @NotNull
    private String rgDocument;

    @NotNull
    private String issuingInstitution;

    @NotNull
    @Size(min = 2, max = 2)
    private String uf;

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public String getRgDocument() {
        return rgDocument;
    }

    public void setRgDocument(String rgDocument) {
        this.rgDocument = rgDocument;
    }

    public String getIssuingInstitution() {
        return issuingInstitution;
    }

    public void setIssuingInstitution(String issuingInstitution) {
        this.issuingInstitution = issuingInstitution;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
