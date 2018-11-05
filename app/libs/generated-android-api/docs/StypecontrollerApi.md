# StypecontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listElementTypesUsingGET**](StypecontrollerApi.md#listElementTypesUsingGET) | **GET** /orgs/{orgId}/lookups/elementTypes | listElementTypes
[**showElementTypeSubDataUsingGET**](StypecontrollerApi.md#showElementTypeSubDataUsingGET) | **GET** /orgs/{orgId}/lookups/elementTypes/{typeId}/{subId} | showElementTypeSubData
[**showElementTypeUsingGET**](StypecontrollerApi.md#showElementTypeUsingGET) | **GET** /orgs/{orgId}/lookups/elementTypes/{typeId} | showElementType


<a name="listElementTypesUsingGET"></a>
# **listElementTypesUsingGET**
> String listElementTypesUsingGET(orgId, visibleInApp)

listElementTypes

listElementTypes

### Example
```java
// Import classes:
//import io.swagger.client.api.StypecontrollerApi;

StypecontrollerApi apiInstance = new StypecontrollerApi();
Long orgId = 789L; // Long | orgId
Boolean visibleInApp = true; // Boolean | visibleInApp
try {
    String result = apiInstance.listElementTypesUsingGET(orgId, visibleInApp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StypecontrollerApi#listElementTypesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **visibleInApp** | **Boolean**| visibleInApp | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showElementTypeSubDataUsingGET"></a>
# **showElementTypeSubDataUsingGET**
> String showElementTypeSubDataUsingGET(orgId, typeId, subId)

showElementTypeSubData

showElementTypeSubData

### Example
```java
// Import classes:
//import io.swagger.client.api.StypecontrollerApi;

StypecontrollerApi apiInstance = new StypecontrollerApi();
Long orgId = 789L; // Long | orgId
Integer typeId = 56; // Integer | typeId
Integer subId = 56; // Integer | subId
try {
    String result = apiInstance.showElementTypeSubDataUsingGET(orgId, typeId, subId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StypecontrollerApi#showElementTypeSubDataUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **typeId** | **Integer**| typeId |
 **subId** | **Integer**| subId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="showElementTypeUsingGET"></a>
# **showElementTypeUsingGET**
> String showElementTypeUsingGET(orgId, typeId)

showElementType

showElementType

### Example
```java
// Import classes:
//import io.swagger.client.api.StypecontrollerApi;

StypecontrollerApi apiInstance = new StypecontrollerApi();
Long orgId = 789L; // Long | orgId
Integer typeId = 56; // Integer | typeId
try {
    String result = apiInstance.showElementTypeUsingGET(orgId, typeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StypecontrollerApi#showElementTypeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **typeId** | **Integer**| typeId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

