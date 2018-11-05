# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.FmedicationadministrationroutecontrollerApi;

public class FmedicationadministrationroutecontrollerApiExample {

    public static void main(String[] args) {
        FmedicationadministrationroutecontrollerApi apiInstance = new FmedicationadministrationroutecontrollerApi();
        Long orgId = 789L; // Long | orgId
        String code = "code_example"; // String | code
        try {
            String result = apiInstance.getMedicationAdministrationRouteByCodeUsingGET(orgId, code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FmedicationadministrationroutecontrollerApi#getMedicationAdministrationRouteByCodeUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080/smis2-core*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FmedicationadministrationroutecontrollerApi* | [**getMedicationAdministrationRouteByCodeUsingGET**](docs/FmedicationadministrationroutecontrollerApi.md#getMedicationAdministrationRouteByCodeUsingGET) | **GET** /orgs/{orgId}/lookups/medicationadministrations/code/{code} | getMedicationAdministrationRouteByCode
*FmedicationadministrationroutecontrollerApi* | [**listMedicationAdministrationRoutesByTypeUsingGET**](docs/FmedicationadministrationroutecontrollerApi.md#listMedicationAdministrationRoutesByTypeUsingGET) | **GET** /orgs/{orgId}/lookups/medicationadministrations/type/{typeId} | listMedicationAdministrationRoutesByType
*FmedicationadministrationroutecontrollerApi* | [**listMedicationAdministrationRoutesUsingGET**](docs/FmedicationadministrationroutecontrollerApi.md#listMedicationAdministrationRoutesUsingGET) | **GET** /orgs/{orgId}/lookups/medicationadministrations | listMedicationAdministrationRoutes
*SattachmentcontrollerApi* | [**createAttachmentUsingPOST**](docs/SattachmentcontrollerApi.md#createAttachmentUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments | createAttachment
*SattachmentcontrollerApi* | [**deleteAttachmentUsingDELETE**](docs/SattachmentcontrollerApi.md#deleteAttachmentUsingDELETE) | **DELETE** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments/{attachmentId} | deleteAttachment
*SattachmentcontrollerApi* | [**listAttachmentsUsingGET**](docs/SattachmentcontrollerApi.md#listAttachmentsUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments | listAttachments
*SattachmentcontrollerApi* | [**showAttachmentFile2UsingGET**](docs/SattachmentcontrollerApi.md#showAttachmentFile2UsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments/{attachmentId}/file/{fileName} | showAttachmentFile2
*SattachmentcontrollerApi* | [**showAttachmentFileUsingGET**](docs/SattachmentcontrollerApi.md#showAttachmentFileUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments/{attachmentId}/file | showAttachmentFile
*SattachmentcontrollerApi* | [**showAttachmentUsingGET**](docs/SattachmentcontrollerApi.md#showAttachmentUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments/{attachmentId} | showAttachment
*SattachmentcontrollerApi* | [**updateAttachmentUsingPOST**](docs/SattachmentcontrollerApi.md#updateAttachmentUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments/{attachmentId} | updateAttachment
*ScavecontrollerApi* | [**listElementCavesUsingGET**](docs/ScavecontrollerApi.md#listElementCavesUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/caves | listElementCaves
*ScavecontrollerApi* | [**listPatientCavesUsingGET**](docs/ScavecontrollerApi.md#listPatientCavesUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/caves | listPatientCaves
*ScavecontrollerApi* | [**writeElementCavesUsingPOST**](docs/ScavecontrollerApi.md#writeElementCavesUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/caves | writeElementCaves
*ScavetypecontrollerApi* | [**listCaveTypesUsingGET**](docs/ScavetypecontrollerApi.md#listCaveTypesUsingGET) | **GET** /orgs/{orgId}/lookups/caveTypes | listCaveTypes
*ScavetypecontrollerApi* | [**showCaveTypeUsingGET**](docs/ScavetypecontrollerApi.md#showCaveTypeUsingGET) | **GET** /orgs/{orgId}/lookups/caveTypes/{typeId} | showCaveType
*ScolorcontrollerApi* | [**createFromJsonUsingPOST**](docs/ScolorcontrollerApi.md#createFromJsonUsingPOST) | **POST** /colors/{orgId} | createFromJson
*ScolorcontrollerApi* | [**listOrgColorsUsingGET**](docs/ScolorcontrollerApi.md#listOrgColorsUsingGET) | **GET** /colors/{orgId} | listOrgColors
*SdiagnosisaddcodecontrollerApi* | [**listDiagnosisAddCodeUsingGET**](docs/SdiagnosisaddcodecontrollerApi.md#listDiagnosisAddCodeUsingGET) | **GET** /orgs/{orgId}/lookups/diagnosisAddCode | listDiagnosisAddCode
*SdiagnosismaincodecontrollerApi* | [**listDiagnosisMainCodeUsingGET**](docs/SdiagnosismaincodecontrollerApi.md#listDiagnosisMainCodeUsingGET) | **GET** /orgs/{orgId}/lookups/diagnosisMainCode | listDiagnosisMainCode
*SelementcontrollerApi* | [**listElementsUsingGET**](docs/SelementcontrollerApi.md#listElementsUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements | listElements
*SelementcontrollerApi* | [**showElementAsPdf2UsingGET**](docs/SelementcontrollerApi.md#showElementAsPdf2UsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/pdf/{fileName} | showElementAsPdf2
*SelementcontrollerApi* | [**showElementAsPdfUsingGET**](docs/SelementcontrollerApi.md#showElementAsPdfUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/pdf | showElementAsPdf
*SelementcontrollerApi* | [**showElementHistoryUsingGET**](docs/SelementcontrollerApi.md#showElementHistoryUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/history | showElementHistory
*SelementcontrollerApi* | [**showElementRevisionUsingGET**](docs/SelementcontrollerApi.md#showElementRevisionUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/history/{revision} | showElementRevision
*SelementcontrollerApi* | [**showElementUsingGET**](docs/SelementcontrollerApi.md#showElementUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId} | showElement
*SelementcontrollerApi* | [**writeElementUsingPOST**](docs/SelementcontrollerApi.md#writeElementUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/elements | writeElement
*SlaboranalysisdatacontrollerApi* | [**listLaborAnalysisDataUsingGET**](docs/SlaboranalysisdatacontrollerApi.md#listLaborAnalysisDataUsingGET) | **GET** /orgs/{orgId}/lookups/laborAnalysisData | listLaborAnalysisData
*SmeasuringdatacontrollerApi* | [**listGroupsUsingGET**](docs/SmeasuringdatacontrollerApi.md#listGroupsUsingGET) | **GET** /orgs/{orgId}/lookups/measuringData/groups | listGroups
*SmeasuringdatacontrollerApi* | [**listMeasuringDataUsingGET**](docs/SmeasuringdatacontrollerApi.md#listMeasuringDataUsingGET) | **GET** /orgs/{orgId}/lookups/measuringData | listMeasuringData
*SmeasuringdatacontrollerApi* | [**listMeasuringTopicsUsingGET**](docs/SmeasuringdatacontrollerApi.md#listMeasuringTopicsUsingGET) | **GET** /orgs/{orgId}/lookups/measuringData/topics | listMeasuringTopics
*SmessagecontrollerApi* | [**inboxDeleteMessageUsingDELETE**](docs/SmessagecontrollerApi.md#inboxDeleteMessageUsingDELETE) | **DELETE** /orgs/{orgId}/inbox/{messageId} | inboxDeleteMessage
*SmessagecontrollerApi* | [**inboxListMessagesUsingGET**](docs/SmessagecontrollerApi.md#inboxListMessagesUsingGET) | **GET** /orgs/{orgId}/inbox | inboxListMessages
*SmessagecontrollerApi* | [**inboxShowMessageUsingGET**](docs/SmessagecontrollerApi.md#inboxShowMessageUsingGET) | **GET** /orgs/{orgId}/inbox/{messageId} | inboxShowMessage
*SmessagecontrollerApi* | [**outboxListMessagesUsingGET**](docs/SmessagecontrollerApi.md#outboxListMessagesUsingGET) | **GET** /orgs/{orgId}/outbox | outboxListMessages
*SmessagecontrollerApi* | [**outboxWriteMessageUsingPOST**](docs/SmessagecontrollerApi.md#outboxWriteMessageUsingPOST) | **POST** /orgs/{orgId}/outbox | outboxWriteMessage
*SnotificationcontrollerApi* | [**listUserNotificationConfigsUsingGET**](docs/SnotificationcontrollerApi.md#listUserNotificationConfigsUsingGET) | **GET** /orgs/{orgId}/users/{userId}/notificationconfigs | listUserNotificationConfigs
*SnotificationcontrollerApi* | [**writeNotificationConfigsUsingPOST**](docs/SnotificationcontrollerApi.md#writeNotificationConfigsUsingPOST) | **POST** /orgs/{orgId}/users/{userId}/notificationconfigs | writeNotificationConfigs
*SorgarticlecontrollerApi* | [**deleteFromJsonUsingDELETE**](docs/SorgarticlecontrollerApi.md#deleteFromJsonUsingDELETE) | **DELETE** /orgs/{orgId}/articles/{phar} | deleteFromJson
*SorgarticlecontrollerApi* | [**listJsonUsingDELETE**](docs/SorgarticlecontrollerApi.md#listJsonUsingDELETE) | **DELETE** /orgs/{orgId}/articles | listJson
*SorgarticlecontrollerApi* | [**listJsonUsingGET**](docs/SorgarticlecontrollerApi.md#listJsonUsingGET) | **GET** /orgs/{orgId}/articles | listJson
*SorgarticlecontrollerApi* | [**listJsonUsingOPTIONS**](docs/SorgarticlecontrollerApi.md#listJsonUsingOPTIONS) | **OPTIONS** /orgs/{orgId}/articles | listJson
*SorgarticlecontrollerApi* | [**listJsonUsingPATCH**](docs/SorgarticlecontrollerApi.md#listJsonUsingPATCH) | **PATCH** /orgs/{orgId}/articles | listJson
*SorgarticlecontrollerApi* | [**listJsonUsingPOST**](docs/SorgarticlecontrollerApi.md#listJsonUsingPOST) | **POST** /orgs/{orgId}/articles | listJson
*SorgarticlecontrollerApi* | [**listJsonUsingPUT**](docs/SorgarticlecontrollerApi.md#listJsonUsingPUT) | **PUT** /orgs/{orgId}/articles | listJson
*SorgcontrollerApi* | [**listAllOrgsUsingGET**](docs/SorgcontrollerApi.md#listAllOrgsUsingGET) | **GET** /orgs/all | listAllOrgs
*SorgcontrollerApi* | [**listOrgGroupsUsingGET**](docs/SorgcontrollerApi.md#listOrgGroupsUsingGET) | **GET** /orgs/{orgId}/groups | listOrgGroups
*SorgcontrollerApi* | [**listOrgRolesUsingGET**](docs/SorgcontrollerApi.md#listOrgRolesUsingGET) | **GET** /orgs/{orgId}/roles | listOrgRoles
*SorgcontrollerApi* | [**listOrgsUsingGET**](docs/SorgcontrollerApi.md#listOrgsUsingGET) | **GET** /orgs | listOrgs
*SorgcontrollerApi* | [**searchPatientsInAllOrgsUsingGET**](docs/SorgcontrollerApi.md#searchPatientsInAllOrgsUsingGET) | **GET** /orgs/searchPatients | searchPatientsInAllOrgs
*SorgcontrollerApi* | [**showOrgUsingGET**](docs/SorgcontrollerApi.md#showOrgUsingGET) | **GET** /orgs/{orgId} | showOrg
*SorgpatientcardcontrollerApi* | [**deletePatientCardUsingDELETE**](docs/SorgpatientcardcontrollerApi.md#deletePatientCardUsingDELETE) | **DELETE** /orgs/{orgId}/patients/{patientId}/cards | deletePatientCard
*SorgpatientcardcontrollerApi* | [**listCardsUsingGET**](docs/SorgpatientcardcontrollerApi.md#listCardsUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/cards | listCards
*SorgpatientcardcontrollerApi* | [**writePatientCardUsingPOST**](docs/SorgpatientcardcontrollerApi.md#writePatientCardUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/cards | writePatientCard
*SorgpatientcontrollerApi* | [**listPatientsUsingGET**](docs/SorgpatientcontrollerApi.md#listPatientsUsingGET) | **GET** /orgs/{orgId}/patients | listPatients
*SorgpatientcontrollerApi* | [**mediPlan2UsingGET**](docs/SorgpatientcontrollerApi.md#mediPlan2UsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/mediPlan/{fileName} | mediPlan2
*SorgpatientcontrollerApi* | [**mediPlanUsingGET**](docs/SorgpatientcontrollerApi.md#mediPlanUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/mediPlan | mediPlan
*SorgpatientcontrollerApi* | [**searchPatientsUsingGET**](docs/SorgpatientcontrollerApi.md#searchPatientsUsingGET) | **GET** /orgs/{orgId}/patients/search | searchPatients
*SorgpatientcontrollerApi* | [**showPatientUsingGET**](docs/SorgpatientcontrollerApi.md#showPatientUsingGET) | **GET** /orgs/{orgId}/patients/{patientId} | showPatient
*SorgpatientcontrollerApi* | [**writePatientUsingPOST**](docs/SorgpatientcontrollerApi.md#writePatientUsingPOST) | **POST** /orgs/{orgId}/patients | writePatient
*SorgpatientdoccontrollerApi* | [**createDocumentUsingPOST**](docs/SorgpatientdoccontrollerApi.md#createDocumentUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/documents | createDocument
*SorgpatientdoccontrollerApi* | [**deleteDocumentUsingDELETE**](docs/SorgpatientdoccontrollerApi.md#deleteDocumentUsingDELETE) | **DELETE** /orgs/{orgId}/patients/{patientId}/documents/{docId} | deleteDocument
*SorgpatientdoccontrollerApi* | [**listDocumentsUsingDELETE**](docs/SorgpatientdoccontrollerApi.md#listDocumentsUsingDELETE) | **DELETE** /orgs/{orgId}/patients/{patientId}/documents | listDocuments
*SorgpatientdoccontrollerApi* | [**listDocumentsUsingGET**](docs/SorgpatientdoccontrollerApi.md#listDocumentsUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/documents | listDocuments
*SorgpatientdoccontrollerApi* | [**listDocumentsUsingOPTIONS**](docs/SorgpatientdoccontrollerApi.md#listDocumentsUsingOPTIONS) | **OPTIONS** /orgs/{orgId}/patients/{patientId}/documents | listDocuments
*SorgpatientdoccontrollerApi* | [**listDocumentsUsingPATCH**](docs/SorgpatientdoccontrollerApi.md#listDocumentsUsingPATCH) | **PATCH** /orgs/{orgId}/patients/{patientId}/documents | listDocuments
*SorgpatientdoccontrollerApi* | [**listDocumentsUsingPUT**](docs/SorgpatientdoccontrollerApi.md#listDocumentsUsingPUT) | **PUT** /orgs/{orgId}/patients/{patientId}/documents | listDocuments
*SorgpatientdoccontrollerApi* | [**showDocumentFile2UsingGET**](docs/SorgpatientdoccontrollerApi.md#showDocumentFile2UsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/documents/{docId}/file/{fileName} | showDocumentFile2
*SorgpatientdoccontrollerApi* | [**showDocumentFileUsingGET**](docs/SorgpatientdoccontrollerApi.md#showDocumentFileUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/documents/{docId}/file | showDocumentFile
*SorgpatientdoccontrollerApi* | [**showDocumentUsingGET**](docs/SorgpatientdoccontrollerApi.md#showDocumentUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/documents/{docId} | showDocument
*SorgpatientdoccontrollerApi* | [**updateDocumentUsingPOST**](docs/SorgpatientdoccontrollerApi.md#updateDocumentUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/documents/{docId} | updateDocument
*SorgpatientpermissioncontrollerApi* | [**listOtherUserPermissionsUsingGET**](docs/SorgpatientpermissioncontrollerApi.md#listOtherUserPermissionsUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/permissions/{userId} | listOtherUserPermissions
*SorgpatientpermissioncontrollerApi* | [**listPermissionsUsingGET**](docs/SorgpatientpermissioncontrollerApi.md#listPermissionsUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/permissions | listPermissions
*SorgpatientrolecontrollerApi* | [**listPatientRolesUsingGET**](docs/SorgpatientrolecontrollerApi.md#listPatientRolesUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/roles | listPatientRoles
*SorgpatientrolecontrollerApi* | [**showPatientRoleUsingGET**](docs/SorgpatientrolecontrollerApi.md#showPatientRoleUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/roles/{roleId} | showPatientRole
*SorgpatientrolecontrollerApi* | [**writeElementUsingPOST**](docs/SorgpatientrolecontrollerApi.md#writeElementUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/roles | writeElement
*SsimpleconfigcontrollerApi* | [**showUserConfigUsingGET**](docs/SsimpleconfigcontrollerApi.md#showUserConfigUsingGET) | **GET** /orgs/{orgId}/users/{userId}/config | showUserConfig
*SsimpleconfigcontrollerApi* | [**writeUserConfigUsingPOST**](docs/SsimpleconfigcontrollerApi.md#writeUserConfigUsingPOST) | **POST** /orgs/{orgId}/users/{userId}/config | writeUserConfig
*StypecontrollerApi* | [**listElementTypesUsingGET**](docs/StypecontrollerApi.md#listElementTypesUsingGET) | **GET** /orgs/{orgId}/lookups/elementTypes | listElementTypes
*StypecontrollerApi* | [**showElementTypeSubDataUsingGET**](docs/StypecontrollerApi.md#showElementTypeSubDataUsingGET) | **GET** /orgs/{orgId}/lookups/elementTypes/{typeId}/{subId} | showElementTypeSubData
*StypecontrollerApi* | [**showElementTypeUsingGET**](docs/StypecontrollerApi.md#showElementTypeUsingGET) | **GET** /orgs/{orgId}/lookups/elementTypes/{typeId} | showElementType
*SuserorgcontrollerApi* | [**changeUserPasswordUsingPOST**](docs/SuserorgcontrollerApi.md#changeUserPasswordUsingPOST) | **POST** /orgs/{orgId}/users/{userId}/changePassword | changeUserPassword
*SuserorgcontrollerApi* | [**listDefaultUserRolesUsingGET**](docs/SuserorgcontrollerApi.md#listDefaultUserRolesUsingGET) | **GET** /orgs/{orgId}/users/roles | listDefaultUserRoles
*SuserorgcontrollerApi* | [**listUsersUsingGET**](docs/SuserorgcontrollerApi.md#listUsersUsingGET) | **GET** /orgs/{orgId}/users | listUsers
*SuserorgcontrollerApi* | [**lookupRefDataUsingGET**](docs/SuserorgcontrollerApi.md#lookupRefDataUsingGET) | **GET** /orgs/{orgId}/users/refDataLookup | lookupRefData
*SuserorgcontrollerApi* | [**lookupUsingGET**](docs/SuserorgcontrollerApi.md#lookupUsingGET) | **GET** /orgs/{orgId}/users/lookup | lookup
*SuserorgcontrollerApi* | [**showUserUsingGET**](docs/SuserorgcontrollerApi.md#showUserUsingGET) | **GET** /orgs/{orgId}/users/{userId} | showUser
*SuserorgcontrollerApi* | [**writeUserUsingPOST**](docs/SuserorgcontrollerApi.md#writeUserUsingPOST) | **POST** /orgs/{orgId}/users | writeUser
*SvaccinationlabelcontrollerApi* | [**listVaccinationLabelUsingGET**](docs/SvaccinationlabelcontrollerApi.md#listVaccinationLabelUsingGET) | **GET** /orgs/{orgId}/lookups/vaccinationLabel | listVaccinationLabel
*VekaproxycontrollerApi* | [**sendVeKaQueryUsingPOST**](docs/VekaproxycontrollerApi.md#sendVeKaQueryUsingPOST) | **POST** /veka | sendVeKaQuery


## Documentation for Models

 - [Calendar](docs/Calendar.md)
 - [SComm](docs/SComm.md)
 - [SOrg](docs/SOrg.md)
 - [SOrgGroup](docs/SOrgGroup.md)
 - [SOrgPatient](docs/SOrgPatient.md)
 - [SOrgPatientPK](docs/SOrgPatientPK.md)
 - [SOrgRole](docs/SOrgRole.md)
 - [TimeZone](docs/TimeZone.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



