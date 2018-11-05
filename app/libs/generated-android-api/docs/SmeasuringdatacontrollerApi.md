# SmeasuringdatacontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listGroupsUsingGET**](SmeasuringdatacontrollerApi.md#listGroupsUsingGET) | **GET** /orgs/{orgId}/lookups/measuringData/groups | listGroups
[**listMeasuringDataUsingGET**](SmeasuringdatacontrollerApi.md#listMeasuringDataUsingGET) | **GET** /orgs/{orgId}/lookups/measuringData | listMeasuringData
[**listMeasuringTopicsUsingGET**](SmeasuringdatacontrollerApi.md#listMeasuringTopicsUsingGET) | **GET** /orgs/{orgId}/lookups/measuringData/topics | listMeasuringTopics


<a name="listGroupsUsingGET"></a>
# **listGroupsUsingGET**
> String listGroupsUsingGET(orgId)

listGroups

listGroups

### Example
```java
// Import classes:
//import io.swagger.client.api.SmeasuringdatacontrollerApi;

SmeasuringdatacontrollerApi apiInstance = new SmeasuringdatacontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listGroupsUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmeasuringdatacontrollerApi#listGroupsUsingGET");
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

<a name="listMeasuringDataUsingGET"></a>
# **listMeasuringDataUsingGET**
> String listMeasuringDataUsingGET(orgId, since)

listMeasuringData

listMeasuringData

### Example
```java
// Import classes:
//import io.swagger.client.api.SmeasuringdatacontrollerApi;

SmeasuringdatacontrollerApi apiInstance = new SmeasuringdatacontrollerApi();
Long orgId = 789L; // Long | orgId
String since = "since_example"; // String | sinceDate
try {
    String result = apiInstance.listMeasuringDataUsingGET(orgId, since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmeasuringdatacontrollerApi#listMeasuringDataUsingGET");
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

<a name="listMeasuringTopicsUsingGET"></a>
# **listMeasuringTopicsUsingGET**
> String listMeasuringTopicsUsingGET(orgId)

listMeasuringTopics

listMeasuringTopics

### Example
```java
// Import classes:
//import io.swagger.client.api.SmeasuringdatacontrollerApi;

SmeasuringdatacontrollerApi apiInstance = new SmeasuringdatacontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listMeasuringTopicsUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmeasuringdatacontrollerApi#listMeasuringTopicsUsingGET");
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

