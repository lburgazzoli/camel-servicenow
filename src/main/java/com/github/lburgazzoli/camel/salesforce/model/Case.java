/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Nov 24 10:26:13 CET 2016
 */
package com.github.lburgazzoli.camel.salesforce.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject Case
 */
@XStreamAlias("Case")
public class Case extends AbstractSObjectBase {

    // CaseNumber
    private String CaseNumber;

    @JsonProperty("CaseNumber")
    public String getCaseNumber() {
        return this.CaseNumber;
    }

    @JsonProperty("CaseNumber")
    public void setCaseNumber(String CaseNumber) {
        this.CaseNumber = CaseNumber;
    }

    // ContactId
    private String ContactId;

    @JsonProperty("ContactId")
    public String getContactId() {
        return this.ContactId;
    }

    @JsonProperty("ContactId")
    public void setContactId(String ContactId) {
        this.ContactId = ContactId;
    }

    // AccountId
    private String AccountId;

    @JsonProperty("AccountId")
    public String getAccountId() {
        return this.AccountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    // AssetId
    private String AssetId;

    @JsonProperty("AssetId")
    public String getAssetId() {
        return this.AssetId;
    }

    @JsonProperty("AssetId")
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    // SuppliedName
    private String SuppliedName;

    @JsonProperty("SuppliedName")
    public String getSuppliedName() {
        return this.SuppliedName;
    }

    @JsonProperty("SuppliedName")
    public void setSuppliedName(String SuppliedName) {
        this.SuppliedName = SuppliedName;
    }

    // SuppliedEmail
    private String SuppliedEmail;

    @JsonProperty("SuppliedEmail")
    public String getSuppliedEmail() {
        return this.SuppliedEmail;
    }

    @JsonProperty("SuppliedEmail")
    public void setSuppliedEmail(String SuppliedEmail) {
        this.SuppliedEmail = SuppliedEmail;
    }

    // SuppliedPhone
    private String SuppliedPhone;

    @JsonProperty("SuppliedPhone")
    public String getSuppliedPhone() {
        return this.SuppliedPhone;
    }

    @JsonProperty("SuppliedPhone")
    public void setSuppliedPhone(String SuppliedPhone) {
        this.SuppliedPhone = SuppliedPhone;
    }

    // SuppliedCompany
    private String SuppliedCompany;

    @JsonProperty("SuppliedCompany")
    public String getSuppliedCompany() {
        return this.SuppliedCompany;
    }

    @JsonProperty("SuppliedCompany")
    public void setSuppliedCompany(String SuppliedCompany) {
        this.SuppliedCompany = SuppliedCompany;
    }

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private Case_TypeEnum Type;

    @JsonProperty("Type")
    public Case_TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(Case_TypeEnum Type) {
        this.Type = Type;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private Case_StatusEnum Status;

    @JsonProperty("Status")
    public Case_StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(Case_StatusEnum Status) {
        this.Status = Status;
    }

    // Reason
    @XStreamConverter(PicklistEnumConverter.class)
    private Case_ReasonEnum Reason;

    @JsonProperty("Reason")
    public Case_ReasonEnum getReason() {
        return this.Reason;
    }

    @JsonProperty("Reason")
    public void setReason(Case_ReasonEnum Reason) {
        this.Reason = Reason;
    }

    // Origin
    @XStreamConverter(PicklistEnumConverter.class)
    private Case_OriginEnum Origin;

    @JsonProperty("Origin")
    public Case_OriginEnum getOrigin() {
        return this.Origin;
    }

    @JsonProperty("Origin")
    public void setOrigin(Case_OriginEnum Origin) {
        this.Origin = Origin;
    }

    // Subject
    private String Subject;

    @JsonProperty("Subject")
    public String getSubject() {
        return this.Subject;
    }

    @JsonProperty("Subject")
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    // Priority
    @XStreamConverter(PicklistEnumConverter.class)
    private Case_PriorityEnum Priority;

    @JsonProperty("Priority")
    public Case_PriorityEnum getPriority() {
        return this.Priority;
    }

    @JsonProperty("Priority")
    public void setPriority(Case_PriorityEnum Priority) {
        this.Priority = Priority;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // IsClosed
    private Boolean IsClosed;

    @JsonProperty("IsClosed")
    public Boolean getIsClosed() {
        return this.IsClosed;
    }

    @JsonProperty("IsClosed")
    public void setIsClosed(Boolean IsClosed) {
        this.IsClosed = IsClosed;
    }

    // ClosedDate
    private java.time.ZonedDateTime ClosedDate;

    @JsonProperty("ClosedDate")
    public java.time.ZonedDateTime getClosedDate() {
        return this.ClosedDate;
    }

    @JsonProperty("ClosedDate")
    public void setClosedDate(java.time.ZonedDateTime ClosedDate) {
        this.ClosedDate = ClosedDate;
    }

    // IsEscalated
    private Boolean IsEscalated;

    @JsonProperty("IsEscalated")
    public Boolean getIsEscalated() {
        return this.IsEscalated;
    }

    @JsonProperty("IsEscalated")
    public void setIsEscalated(Boolean IsEscalated) {
        this.IsEscalated = IsEscalated;
    }

    // ContactPhone
    private String ContactPhone;

    @JsonProperty("ContactPhone")
    public String getContactPhone() {
        return this.ContactPhone;
    }

    @JsonProperty("ContactPhone")
    public void setContactPhone(String ContactPhone) {
        this.ContactPhone = ContactPhone;
    }

    // ContactMobile
    private String ContactMobile;

    @JsonProperty("ContactMobile")
    public String getContactMobile() {
        return this.ContactMobile;
    }

    @JsonProperty("ContactMobile")
    public void setContactMobile(String ContactMobile) {
        this.ContactMobile = ContactMobile;
    }

    // ContactEmail
    private String ContactEmail;

    @JsonProperty("ContactEmail")
    public String getContactEmail() {
        return this.ContactEmail;
    }

    @JsonProperty("ContactEmail")
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    // ContactFax
    private String ContactFax;

    @JsonProperty("ContactFax")
    public String getContactFax() {
        return this.ContactFax;
    }

    @JsonProperty("ContactFax")
    public void setContactFax(String ContactFax) {
        this.ContactFax = ContactFax;
    }

    // EngineeringReqNumber__c
    private String EngineeringReqNumber__c;

    @JsonProperty("EngineeringReqNumber__c")
    public String getEngineeringReqNumber__c() {
        return this.EngineeringReqNumber__c;
    }

    @JsonProperty("EngineeringReqNumber__c")
    public void setEngineeringReqNumber__c(String EngineeringReqNumber__c) {
        this.EngineeringReqNumber__c = EngineeringReqNumber__c;
    }

    // SLAViolation__c
    @XStreamConverter(PicklistEnumConverter.class)
    private Case_SLAViolationEnum SLAViolation__c;

    @JsonProperty("SLAViolation__c")
    public Case_SLAViolationEnum getSLAViolation__c() {
        return this.SLAViolation__c;
    }

    @JsonProperty("SLAViolation__c")
    public void setSLAViolation__c(Case_SLAViolationEnum SLAViolation__c) {
        this.SLAViolation__c = SLAViolation__c;
    }

    // Product__c
    @XStreamConverter(PicklistEnumConverter.class)
    private Case_ProductEnum Product__c;

    @JsonProperty("Product__c")
    public Case_ProductEnum getProduct__c() {
        return this.Product__c;
    }

    @JsonProperty("Product__c")
    public void setProduct__c(Case_ProductEnum Product__c) {
        this.Product__c = Product__c;
    }

    // PotentialLiability__c
    @XStreamConverter(PicklistEnumConverter.class)
    private Case_PotentialLiabilityEnum PotentialLiability__c;

    @JsonProperty("PotentialLiability__c")
    public Case_PotentialLiabilityEnum getPotentialLiability__c() {
        return this.PotentialLiability__c;
    }

    @JsonProperty("PotentialLiability__c")
    public void setPotentialLiability__c(Case_PotentialLiabilityEnum PotentialLiability__c) {
        this.PotentialLiability__c = PotentialLiability__c;
    }

    // ExtenralID__c
    private String ExtenralID__c;

    @JsonProperty("ExtenralID__c")
    public String getExtenralID__c() {
        return this.ExtenralID__c;
    }

    @JsonProperty("ExtenralID__c")
    public void setExtenralID__c(String ExtenralID__c) {
        this.ExtenralID__c = ExtenralID__c;
    }

    // InternalID__c
    private String InternalID__c;

    @JsonProperty("InternalID__c")
    public String getInternalID__c() {
        return this.InternalID__c;
    }

    @JsonProperty("InternalID__c")
    public void setInternalID__c(String InternalID__c) {
        this.InternalID__c = InternalID__c;
    }

}
