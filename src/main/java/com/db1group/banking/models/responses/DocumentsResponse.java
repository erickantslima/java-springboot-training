package com.db1group.banking.models.responses;

public class DocumentsResponse {

    private String securityNumber;
    private String rgDocument;
    private String issuingInstitution;
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
