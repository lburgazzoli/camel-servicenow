/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 18 14:59:16 CET 2016
 */
package com.github.lburgazzoli.camel.salesforce.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CleanStatus
 */
public enum Contact_CleanStatusEnum {

    // Acknowledged
    ACKNOWLEDGED("Acknowledged"),
    // Different
    DIFFERENT("Different"),
    // Inactive
    INACTIVE("Inactive"),
    // Matched
    MATCHED("Matched"),
    // NotFound
    NOTFOUND("NotFound"),
    // Pending
    PENDING("Pending"),
    // SelectMatch
    SELECTMATCH("SelectMatch"),
    // Skipped
    SKIPPED("Skipped");

    final String value;

    private Contact_CleanStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Contact_CleanStatusEnum fromValue(String value) {
        for (Contact_CleanStatusEnum e : Contact_CleanStatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}