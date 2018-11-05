# SvaccinationlabelcontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listVaccinationLabelUsingGET**](SvaccinationlabelcontrollerApi.md#listVaccinationLabelUsingGET) | **GET** /orgs/{orgId}/lookups/vaccinationLabel | listVaccinationLabel


<a name="listVaccinationLabelUsingGET"></a>
# **listVaccinationLabelUsingGET**
> String listVaccinationLabelUsingGET(orgId)

listVaccinationLabel

listVaccinationLabel

### Example
```java
// Import classes:
//import io.swagger.client.api.SvaccinationlabelcontrollerApi;

SvaccinationlabelcontrollerApi apiInstance = new SvaccinationlabelcontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listVaccinationLabelUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SvaccinationlabelcontrollerApi#listVaccinationLabelUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

