/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 23 10:44:07 CEST 2017
 */
package com.github.lburgazzoli.camel.salesforce.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractDescribedSObjectBase;
import org.apache.camel.component.salesforce.api.dto.ChildRelationShip;
import org.apache.camel.component.salesforce.api.dto.InfoUrls;
import org.apache.camel.component.salesforce.api.dto.NamedLayoutInfo;
import org.apache.camel.component.salesforce.api.dto.RecordTypeInfo;
import org.apache.camel.component.salesforce.api.dto.SObjectDescription;
import org.apache.camel.component.salesforce.api.dto.SObjectDescriptionUrls;
import org.apache.camel.component.salesforce.api.dto.SObjectField;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CaseComment
 */
@XStreamAlias("CaseComment")
public class CaseComment extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

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

    // IsPublished
    private Boolean IsPublished;

    @JsonProperty("IsPublished")
    public Boolean getIsPublished() {
        return this.IsPublished;
    }

    @JsonProperty("IsPublished")
    public void setIsPublished(Boolean IsPublished) {
        this.IsPublished = IsPublished;
    }

    // CommentBody
    private String CommentBody;

    @JsonProperty("CommentBody")
    public String getCommentBody() {
        return this.CommentBody;
    }

    @JsonProperty("CommentBody")
    public void setCommentBody(String CommentBody) {
        this.CommentBody = CommentBody;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();
//wtf

        description.setMergeable(false);
        description.setCreateable(true);
        description.setQueryable(true);
        description.setLabel("Case Comment");
        description.setReplicateable(true);
        description.setName("CaseComment");
        description.setLayoutable(false);
        description.setDeprecatedAndHidden(false);
        description.setMruEnabled(false);
        description.setFeedEnabled(false);
        description.setSearchable(true);
        description.setCustomSetting(false);
        description.setRetrieveable(true);
        description.setKeyPrefix("00a");
        description.setUndeletable(true);
        description.setSearchLayoutable("false");
        description.setCustom(false);
        description.setTriggerable(true);

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v39.0/sobjects/CaseComment/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v39.0/sobjects/CaseComment");
        sObjectDescriptionUrls1.setDefaultValues("/services/data/v39.0/sobjects/CaseComment/defaultValues?recordTypeId&fields");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v39.0/sobjects/CaseComment/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setCompactLayoutable(false);

        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = new SObjectField();
        fields1.add(sObjectField1);

        sObjectField1.setWriteRequiresMasterRead(false);
        sObjectField1.setNillable(false);
        sObjectField1.setCreateable(false);
        sObjectField1.setEncrypted(false);
        sObjectField1.setDependentPicklist(false);
        sObjectField1.setDigits("0");
        sObjectField1.setLabel("Case Comment ID");
        sObjectField1.setHighScaleNumber(false);
        sObjectField1.setDisplayLocationInDecimal(false);
        sObjectField1.setName("Id");
        sObjectField1.setHtmlFormatted(false);
        sObjectField1.setDeprecatedAndHidden(false);
        sObjectField1.setRestrictedPicklist(false);
        sObjectField1.setNameField(false);
        sObjectField1.setCaseSensitive(false);
        sObjectField1.setPermissionable(false);
        sObjectField1.setCascadeDelete(false);
        sObjectField1.setDefaultedOnCreate(true);
        sObjectField1.setExternalId(false);
        sObjectField1.setSoapType("tns:ID");
        sObjectField1.setScale(0);
        sObjectField1.setCustom(false);
        sObjectField1.setGroupable(true);
        sObjectField1.setRestrictedDelete(false);
        sObjectField1.setCalculated(false);
        sObjectField1.setNamePointing(false);
        sObjectField1.setIdLookup(true);
        sObjectField1.setType("id");
        sObjectField1.setPrecision(0);
        sObjectField1.setLength(18);
        sObjectField1.setSortable(true);
        sObjectField1.setByteLength(18);
        sObjectField1.setUpdateable(false);
        sObjectField1.setFilterable(true);
        sObjectField1.setQueryByDistance(false);
        sObjectField1.setUnique(false);
        sObjectField1.setAutoNumber(false);

        final SObjectField sObjectField2 = new SObjectField();
        fields1.add(sObjectField2);

        sObjectField2.setWriteRequiresMasterRead(false);
        sObjectField2.setNillable(false);
        sObjectField2.setCreateable(true);
        sObjectField2.setEncrypted(false);
        sObjectField2.setDependentPicklist(false);
        sObjectField2.setDigits("0");
        sObjectField2.setLabel("Parent ID");
        sObjectField2.setHighScaleNumber(false);
        sObjectField2.setDisplayLocationInDecimal(false);
        sObjectField2.setName("ParentId");
        sObjectField2.setHtmlFormatted(false);
        sObjectField2.setDeprecatedAndHidden(false);
        sObjectField2.setRestrictedPicklist(false);
        sObjectField2.setNameField(false);
        sObjectField2.setCaseSensitive(false);
        sObjectField2.setPermissionable(false);
        sObjectField2.setCascadeDelete(false);
        sObjectField2.setDefaultedOnCreate(false);
        sObjectField2.setExternalId(false);
        sObjectField2.setSoapType("tns:ID");
        sObjectField2.setScale(0);
        sObjectField2.setCustom(false);
        sObjectField2.setGroupable(true);
        sObjectField2.setRestrictedDelete(false);
        sObjectField2.setCalculated(false);
        sObjectField2.setNamePointing(false);
        sObjectField2.setIdLookup(false);
        sObjectField2.setType("reference");
        sObjectField2.setRelationshipName("Parent");

        final List<String> referenceTo1 = new ArrayList<>();
        sObjectField2.setReferenceTo(referenceTo1);

        referenceTo1.add("Case");

        sObjectField2.setPrecision(0);
        sObjectField2.setLength(18);
        sObjectField2.setSortable(true);
        sObjectField2.setByteLength(18);
        sObjectField2.setUpdateable(false);
        sObjectField2.setFilterable(true);
        sObjectField2.setQueryByDistance(false);
        sObjectField2.setUnique(false);
        sObjectField2.setAutoNumber(false);

        final SObjectField sObjectField3 = new SObjectField();
        fields1.add(sObjectField3);

        sObjectField3.setWriteRequiresMasterRead(false);
        sObjectField3.setNillable(false);
        sObjectField3.setCreateable(true);
        sObjectField3.setEncrypted(false);
        sObjectField3.setDependentPicklist(false);
        sObjectField3.setDigits("0");
        sObjectField3.setLabel("Published");
        sObjectField3.setHighScaleNumber(false);
        sObjectField3.setDisplayLocationInDecimal(false);
        sObjectField3.setName("IsPublished");
        sObjectField3.setHtmlFormatted(false);
        sObjectField3.setDeprecatedAndHidden(false);
        sObjectField3.setDefaultValue("false");
        sObjectField3.setRestrictedPicklist(false);
        sObjectField3.setNameField(false);
        sObjectField3.setCaseSensitive(false);
        sObjectField3.setPermissionable(false);
        sObjectField3.setCascadeDelete(false);
        sObjectField3.setDefaultedOnCreate(true);
        sObjectField3.setExternalId(false);
        sObjectField3.setSoapType("xsd:boolean");
        sObjectField3.setScale(0);
        sObjectField3.setCustom(false);
        sObjectField3.setGroupable(true);
        sObjectField3.setRestrictedDelete(false);
        sObjectField3.setCalculated(false);
        sObjectField3.setNamePointing(false);
        sObjectField3.setIdLookup(false);
        sObjectField3.setType("boolean");
        sObjectField3.setPrecision(0);
        sObjectField3.setLength(0);
        sObjectField3.setSortable(true);
        sObjectField3.setByteLength(0);
        sObjectField3.setUpdateable(true);
        sObjectField3.setFilterable(true);
        sObjectField3.setQueryByDistance(false);
        sObjectField3.setUnique(false);
        sObjectField3.setAutoNumber(false);

        final SObjectField sObjectField4 = new SObjectField();
        fields1.add(sObjectField4);

        sObjectField4.setWriteRequiresMasterRead(false);
        sObjectField4.setNillable(true);
        sObjectField4.setCreateable(true);
        sObjectField4.setEncrypted(false);
        sObjectField4.setDependentPicklist(false);
        sObjectField4.setExtraTypeInfo("plaintextarea");
        sObjectField4.setDigits("0");
        sObjectField4.setLabel("Body");
        sObjectField4.setHighScaleNumber(false);
        sObjectField4.setDisplayLocationInDecimal(false);
        sObjectField4.setName("CommentBody");
        sObjectField4.setHtmlFormatted(false);
        sObjectField4.setDeprecatedAndHidden(false);
        sObjectField4.setRestrictedPicklist(false);
        sObjectField4.setNameField(false);
        sObjectField4.setCaseSensitive(false);
        sObjectField4.setPermissionable(false);
        sObjectField4.setCascadeDelete(false);
        sObjectField4.setDefaultedOnCreate(false);
        sObjectField4.setExternalId(false);
        sObjectField4.setSoapType("xsd:string");
        sObjectField4.setScale(0);
        sObjectField4.setCustom(false);
        sObjectField4.setGroupable(false);
        sObjectField4.setRestrictedDelete(false);
        sObjectField4.setCalculated(false);
        sObjectField4.setNamePointing(false);
        sObjectField4.setIdLookup(false);
        sObjectField4.setType("textarea");
        sObjectField4.setPrecision(0);
        sObjectField4.setLength(4000);
        sObjectField4.setSortable(true);
        sObjectField4.setByteLength(4000);
        sObjectField4.setUpdateable(true);
        sObjectField4.setFilterable(true);
        sObjectField4.setQueryByDistance(false);
        sObjectField4.setUnique(false);
        sObjectField4.setAutoNumber(false);

        final SObjectField sObjectField5 = new SObjectField();
        fields1.add(sObjectField5);

        sObjectField5.setWriteRequiresMasterRead(false);
        sObjectField5.setNillable(false);
        sObjectField5.setCreateable(false);
        sObjectField5.setEncrypted(false);
        sObjectField5.setDependentPicklist(false);
        sObjectField5.setDigits("0");
        sObjectField5.setLabel("Created By ID");
        sObjectField5.setHighScaleNumber(false);
        sObjectField5.setDisplayLocationInDecimal(false);
        sObjectField5.setName("CreatedById");
        sObjectField5.setHtmlFormatted(false);
        sObjectField5.setDeprecatedAndHidden(false);
        sObjectField5.setRestrictedPicklist(false);
        sObjectField5.setNameField(false);
        sObjectField5.setCaseSensitive(false);
        sObjectField5.setPermissionable(false);
        sObjectField5.setCascadeDelete(false);
        sObjectField5.setDefaultedOnCreate(true);
        sObjectField5.setExternalId(false);
        sObjectField5.setSoapType("tns:ID");
        sObjectField5.setScale(0);
        sObjectField5.setCustom(false);
        sObjectField5.setGroupable(true);
        sObjectField5.setRestrictedDelete(false);
        sObjectField5.setCalculated(false);
        sObjectField5.setNamePointing(true);
        sObjectField5.setIdLookup(false);
        sObjectField5.setType("reference");
        sObjectField5.setRelationshipName("CreatedBy");

        final List<String> referenceTo2 = new ArrayList<>();
        sObjectField5.setReferenceTo(referenceTo2);

        referenceTo2.add("User");

        sObjectField5.setPrecision(0);
        sObjectField5.setLength(18);
        sObjectField5.setSortable(true);
        sObjectField5.setByteLength(18);
        sObjectField5.setUpdateable(false);
        sObjectField5.setFilterable(true);
        sObjectField5.setQueryByDistance(false);
        sObjectField5.setUnique(false);
        sObjectField5.setAutoNumber(false);

        final SObjectField sObjectField6 = new SObjectField();
        fields1.add(sObjectField6);

        sObjectField6.setWriteRequiresMasterRead(false);
        sObjectField6.setNillable(false);
        sObjectField6.setCreateable(false);
        sObjectField6.setEncrypted(false);
        sObjectField6.setDependentPicklist(false);
        sObjectField6.setDigits("0");
        sObjectField6.setLabel("Created Date");
        sObjectField6.setHighScaleNumber(false);
        sObjectField6.setDisplayLocationInDecimal(false);
        sObjectField6.setName("CreatedDate");
        sObjectField6.setHtmlFormatted(false);
        sObjectField6.setDeprecatedAndHidden(false);
        sObjectField6.setRestrictedPicklist(false);
        sObjectField6.setNameField(false);
        sObjectField6.setCaseSensitive(false);
        sObjectField6.setPermissionable(false);
        sObjectField6.setCascadeDelete(false);
        sObjectField6.setDefaultedOnCreate(true);
        sObjectField6.setExternalId(false);
        sObjectField6.setSoapType("xsd:dateTime");
        sObjectField6.setScale(0);
        sObjectField6.setCustom(false);
        sObjectField6.setGroupable(false);
        sObjectField6.setRestrictedDelete(false);
        sObjectField6.setCalculated(false);
        sObjectField6.setNamePointing(false);
        sObjectField6.setIdLookup(false);
        sObjectField6.setType("datetime");
        sObjectField6.setPrecision(0);
        sObjectField6.setLength(0);
        sObjectField6.setSortable(true);
        sObjectField6.setByteLength(0);
        sObjectField6.setUpdateable(false);
        sObjectField6.setFilterable(true);
        sObjectField6.setQueryByDistance(false);
        sObjectField6.setUnique(false);
        sObjectField6.setAutoNumber(false);

        final SObjectField sObjectField7 = new SObjectField();
        fields1.add(sObjectField7);

        sObjectField7.setWriteRequiresMasterRead(false);
        sObjectField7.setNillable(false);
        sObjectField7.setCreateable(false);
        sObjectField7.setEncrypted(false);
        sObjectField7.setDependentPicklist(false);
        sObjectField7.setDigits("0");
        sObjectField7.setLabel("System Modstamp");
        sObjectField7.setHighScaleNumber(false);
        sObjectField7.setDisplayLocationInDecimal(false);
        sObjectField7.setName("SystemModstamp");
        sObjectField7.setHtmlFormatted(false);
        sObjectField7.setDeprecatedAndHidden(false);
        sObjectField7.setRestrictedPicklist(false);
        sObjectField7.setNameField(false);
        sObjectField7.setCaseSensitive(false);
        sObjectField7.setPermissionable(false);
        sObjectField7.setCascadeDelete(false);
        sObjectField7.setDefaultedOnCreate(true);
        sObjectField7.setExternalId(false);
        sObjectField7.setSoapType("xsd:dateTime");
        sObjectField7.setScale(0);
        sObjectField7.setCustom(false);
        sObjectField7.setGroupable(false);
        sObjectField7.setRestrictedDelete(false);
        sObjectField7.setCalculated(false);
        sObjectField7.setNamePointing(false);
        sObjectField7.setIdLookup(false);
        sObjectField7.setType("datetime");
        sObjectField7.setPrecision(0);
        sObjectField7.setLength(0);
        sObjectField7.setSortable(true);
        sObjectField7.setByteLength(0);
        sObjectField7.setUpdateable(false);
        sObjectField7.setFilterable(true);
        sObjectField7.setQueryByDistance(false);
        sObjectField7.setUnique(false);
        sObjectField7.setAutoNumber(false);

        final SObjectField sObjectField8 = new SObjectField();
        fields1.add(sObjectField8);

        sObjectField8.setWriteRequiresMasterRead(false);
        sObjectField8.setNillable(false);
        sObjectField8.setCreateable(false);
        sObjectField8.setEncrypted(false);
        sObjectField8.setDependentPicklist(false);
        sObjectField8.setDigits("0");
        sObjectField8.setLabel("Last Modified Date");
        sObjectField8.setHighScaleNumber(false);
        sObjectField8.setDisplayLocationInDecimal(false);
        sObjectField8.setName("LastModifiedDate");
        sObjectField8.setHtmlFormatted(false);
        sObjectField8.setDeprecatedAndHidden(false);
        sObjectField8.setRestrictedPicklist(false);
        sObjectField8.setNameField(false);
        sObjectField8.setCaseSensitive(false);
        sObjectField8.setPermissionable(false);
        sObjectField8.setCascadeDelete(false);
        sObjectField8.setDefaultedOnCreate(true);
        sObjectField8.setExternalId(false);
        sObjectField8.setSoapType("xsd:dateTime");
        sObjectField8.setScale(0);
        sObjectField8.setCustom(false);
        sObjectField8.setGroupable(false);
        sObjectField8.setRestrictedDelete(false);
        sObjectField8.setCalculated(false);
        sObjectField8.setNamePointing(false);
        sObjectField8.setIdLookup(false);
        sObjectField8.setType("datetime");
        sObjectField8.setPrecision(0);
        sObjectField8.setLength(0);
        sObjectField8.setSortable(true);
        sObjectField8.setByteLength(0);
        sObjectField8.setUpdateable(false);
        sObjectField8.setFilterable(true);
        sObjectField8.setQueryByDistance(false);
        sObjectField8.setUnique(false);
        sObjectField8.setAutoNumber(false);

        final SObjectField sObjectField9 = new SObjectField();
        fields1.add(sObjectField9);

        sObjectField9.setWriteRequiresMasterRead(false);
        sObjectField9.setNillable(false);
        sObjectField9.setCreateable(false);
        sObjectField9.setEncrypted(false);
        sObjectField9.setDependentPicklist(false);
        sObjectField9.setDigits("0");
        sObjectField9.setLabel("Last Modified By ID");
        sObjectField9.setHighScaleNumber(false);
        sObjectField9.setDisplayLocationInDecimal(false);
        sObjectField9.setName("LastModifiedById");
        sObjectField9.setHtmlFormatted(false);
        sObjectField9.setDeprecatedAndHidden(false);
        sObjectField9.setRestrictedPicklist(false);
        sObjectField9.setNameField(false);
        sObjectField9.setCaseSensitive(false);
        sObjectField9.setPermissionable(false);
        sObjectField9.setCascadeDelete(false);
        sObjectField9.setDefaultedOnCreate(true);
        sObjectField9.setExternalId(false);
        sObjectField9.setSoapType("tns:ID");
        sObjectField9.setScale(0);
        sObjectField9.setCustom(false);
        sObjectField9.setGroupable(true);
        sObjectField9.setRestrictedDelete(false);
        sObjectField9.setCalculated(false);
        sObjectField9.setNamePointing(true);
        sObjectField9.setIdLookup(false);
        sObjectField9.setType("reference");
        sObjectField9.setRelationshipName("LastModifiedBy");

        final List<String> referenceTo3 = new ArrayList<>();
        sObjectField9.setReferenceTo(referenceTo3);

        referenceTo3.add("User");

        sObjectField9.setPrecision(0);
        sObjectField9.setLength(18);
        sObjectField9.setSortable(true);
        sObjectField9.setByteLength(18);
        sObjectField9.setUpdateable(false);
        sObjectField9.setFilterable(true);
        sObjectField9.setQueryByDistance(false);
        sObjectField9.setUnique(false);
        sObjectField9.setAutoNumber(false);

        final SObjectField sObjectField10 = new SObjectField();
        fields1.add(sObjectField10);

        sObjectField10.setWriteRequiresMasterRead(false);
        sObjectField10.setNillable(false);
        sObjectField10.setCreateable(false);
        sObjectField10.setEncrypted(false);
        sObjectField10.setDependentPicklist(false);
        sObjectField10.setDigits("0");
        sObjectField10.setLabel("Deleted");
        sObjectField10.setHighScaleNumber(false);
        sObjectField10.setDisplayLocationInDecimal(false);
        sObjectField10.setName("IsDeleted");
        sObjectField10.setHtmlFormatted(false);
        sObjectField10.setDeprecatedAndHidden(false);
        sObjectField10.setDefaultValue("false");
        sObjectField10.setRestrictedPicklist(false);
        sObjectField10.setNameField(false);
        sObjectField10.setCaseSensitive(false);
        sObjectField10.setPermissionable(false);
        sObjectField10.setCascadeDelete(false);
        sObjectField10.setDefaultedOnCreate(true);
        sObjectField10.setExternalId(false);
        sObjectField10.setSoapType("xsd:boolean");
        sObjectField10.setScale(0);
        sObjectField10.setCustom(false);
        sObjectField10.setGroupable(true);
        sObjectField10.setRestrictedDelete(false);
        sObjectField10.setCalculated(false);
        sObjectField10.setNamePointing(false);
        sObjectField10.setIdLookup(false);
        sObjectField10.setType("boolean");
        sObjectField10.setPrecision(0);
        sObjectField10.setLength(0);
        sObjectField10.setSortable(true);
        sObjectField10.setByteLength(0);
        sObjectField10.setUpdateable(false);
        sObjectField10.setFilterable(true);
        sObjectField10.setQueryByDistance(false);
        sObjectField10.setUnique(false);
        sObjectField10.setAutoNumber(false);


        description.setActivateable(false);
        description.setUpdateable(true);
        description.setLabelPlural("Case Comments");
        description.setDeletable(true);

        return description;
    }
}
