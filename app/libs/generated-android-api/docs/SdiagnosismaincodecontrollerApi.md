# SdiagnosismaincodecontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDiagnosisMainCodeUsingGET**](SdiagnosismaincodecontrollerApi.md#listDiagnosisMainCodeUsingGET) | **GET** /orgs/{orgId}/lookups/diagnosisMainCode | listDiagnosisMainCode


<a name="listDiagnosisMainCodeUsingGET"></a>
# **listDiagnosisMainCodeUsingGET**
> String listDiagnosisMainCodeUsingGET(orgId)

listDiagnosisMainCode

listDiagnosisMainCode

### Example
```java
// Import classes:
//import io.swagger.client.api.SdiagnosismaincodecontrollerApi;

SdiagnosismaincodecontrollerApi apiInstance = new SdiagnosismaincodecontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listDiagnosisMainCodeUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SdiagnosismaincodecontrollerApi#listDiagnosisMainCodeUsingGET");
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

