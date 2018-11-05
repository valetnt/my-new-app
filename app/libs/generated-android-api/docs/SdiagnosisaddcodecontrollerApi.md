# SdiagnosisaddcodecontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDiagnosisAddCodeUsingGET**](SdiagnosisaddcodecontrollerApi.md#listDiagnosisAddCodeUsingGET) | **GET** /orgs/{orgId}/lookups/diagnosisAddCode | listDiagnosisAddCode


<a name="listDiagnosisAddCodeUsingGET"></a>
# **listDiagnosisAddCodeUsingGET**
> String listDiagnosisAddCodeUsingGET(orgId)

listDiagnosisAddCode

listDiagnosisAddCode

### Example
```java
// Import classes:
//import io.swagger.client.api.SdiagnosisaddcodecontrollerApi;

SdiagnosisaddcodecontrollerApi apiInstance = new SdiagnosisaddcodecontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listDiagnosisAddCodeUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SdiagnosisaddcodecontrollerApi#listDiagnosisAddCodeUsingGET");
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

