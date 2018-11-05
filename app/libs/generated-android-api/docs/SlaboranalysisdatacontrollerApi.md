# SlaboranalysisdatacontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listLaborAnalysisDataUsingGET**](SlaboranalysisdatacontrollerApi.md#listLaborAnalysisDataUsingGET) | **GET** /orgs/{orgId}/lookups/laborAnalysisData | listLaborAnalysisData


<a name="listLaborAnalysisDataUsingGET"></a>
# **listLaborAnalysisDataUsingGET**
> String listLaborAnalysisDataUsingGET(orgId, since)

listLaborAnalysisData

listLaborAnalysisData

### Example
```java
// Import classes:
//import io.swagger.client.api.SlaboranalysisdatacontrollerApi;

SlaboranalysisdatacontrollerApi apiInstance = new SlaboranalysisdatacontrollerApi();
Long orgId = 789L; // Long | orgId
String since = "since_example"; // String | sinceDate
try {
    String result = apiInstance.listLaborAnalysisDataUsingGET(orgId, since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlaboranalysisdatacontrollerApi#listLaborAnalysisDataUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **since** | **String**| sinceDate | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

