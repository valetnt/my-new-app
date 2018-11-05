# ScavecontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listElementCavesUsingGET**](ScavecontrollerApi.md#listElementCavesUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/caves | listElementCaves
[**listPatientCavesUsingGET**](ScavecontrollerApi.md#listPatientCavesUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/caves | listPatientCaves
[**writeElementCavesUsingPOST**](ScavecontrollerApi.md#writeElementCavesUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/caves | writeElementCaves


<a name="listElementCavesUsingGET"></a>
# **listElementCavesUsingGET**
> String listElementCavesUsingGET(orgId, patientId, elementId)

listElementCaves

listElementCaves

### Example
```java
// Import classes:
//import io.swagger.client.api.ScavecontrollerApi;

ScavecontrollerApi apiInstance = new ScavecontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long elementId = 789L; // Long | elementId
try {
    String result = apiInstance.listElementCavesUsingGET(orgId, patientId, elementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScavecontrollerApi#listElementCavesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **elementId** | **Long**| elementId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPatientCavesUsingGET"></a>
# **listPatientCavesUsingGET**
> String listPatientCavesUsingGET(orgId, patientId)

listPatientCaves

listPatientCaves

### Example
```java
// Import classes:
//import io.swagger.client.api.ScavecontrollerApi;

ScavecontrollerApi apiInstance = new ScavecontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
try {
    String result = apiInstance.listPatientCavesUsingGET(orgId, patientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScavecontrollerApi#listPatientCavesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="writeElementCavesUsingPOST"></a>
# **writeElementCavesUsingPOST**
> String writeElementCavesUsingPOST(orgId, patientId, elementId, json)

writeElementCaves

writeElementCaves

### Example
```java
// Import classes:
//import io.swagger.client.api.ScavecontrollerApi;

ScavecontrollerApi apiInstance = new ScavecontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long elementId = 789L; // Long | elementId
String json = "json_example"; // String | json
try {
    String result = apiInstance.writeElementCavesUsingPOST(orgId, patientId, elementId, json);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScavecontrollerApi#writeElementCavesUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **elementId** | **Long**| elementId |
 **json** | **String**| json |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

