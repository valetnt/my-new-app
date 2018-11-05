# ScavetypecontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCaveTypesUsingGET**](ScavetypecontrollerApi.md#listCaveTypesUsingGET) | **GET** /orgs/{orgId}/lookups/caveTypes | listCaveTypes
[**showCaveTypeUsingGET**](ScavetypecontrollerApi.md#showCaveTypeUsingGET) | **GET** /orgs/{orgId}/lookups/caveTypes/{typeId} | showCaveType


<a name="listCaveTypesUsingGET"></a>
# **listCaveTypesUsingGET**
> String listCaveTypesUsingGET(orgId)

listCaveTypes

listCaveTypes

### Example
```java
// Import classes:
//import io.swagger.client.api.ScavetypecontrollerApi;

ScavetypecontrollerApi apiInstance = new ScavetypecontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listCaveTypesUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScavetypecontrollerApi#listCaveTypesUsingGET");
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

<a name="showCaveTypeUsingGET"></a>
# **showCaveTypeUsingGET**
> String showCaveTypeUsingGET(orgId, typeId)

showCaveType

showCaveType

### Example
```java
// Import classes:
//import io.swagger.client.api.ScavetypecontrollerApi;

ScavetypecontrollerApi apiInstance = new ScavetypecontrollerApi();
Long orgId = 789L; // Long | orgId
Long typeId = 789L; // Long | typeId
try {
    String result = apiInstance.showCaveTypeUsingGET(orgId, typeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScavetypecontrollerApi#showCaveTypeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **typeId** | **Long**| typeId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

