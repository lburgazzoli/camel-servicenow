/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 16 13:01:59 CET 2017
 */
package com.github.lburgazzoli.camel.salesforce.model;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type Comment_Event__c
 */
public class QueryRecordsComment_Event__c extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<Comment_Event__c> records;

    public List<Comment_Event__c> getRecords() {
        return records;
    }

    public void setRecords(List<Comment_Event__c> records) {
        this.records = records;
    }
}
