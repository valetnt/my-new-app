# SelementcontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listElementsUsingGET**](SelementcontrollerApi.md#listElementsUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements | listElements
[**showElementAsPdf2UsingGET**](SelementcontrollerApi.md#showElementAsPdf2UsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/pdf/{fileName} | showElementAsPdf2
[**showElementAsPdfUsingGET**](SelementcontrollerApi.md#showElementAsPdfUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/pdf | showElementAsPdf
[**showElementHistoryUsingGET**](SelementcontrollerApi.md#showElementHistoryUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/history | showElementHistory
[**showElementRevisionUsingGET**](SelementcontrollerApi.md#showElementRevisionUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/history/{revision} | showElementRevision
[**showElementUsingGET**](SelementcontrollerApi.md#showElementUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId} | showElement
[**writeElementUsingPOST**](SelementcontrollerApi.md#writeElementUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/elements | writeElement


<a name="listElementsUsingGET"></a>
# **listElementsUsingGET**
> listElementsUsingGET(orgId, patientId, since, typeId, typeNatureId)

listElements

listElements

### Example
```java
// Import classes:
//import io.swagger.client.api.SelementcontrollerApi;

SelementcontrollerApi apiInstance = new SelementcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
String since = "since_example"; // String | sinceDate
Integer typeId = 56; // Integer | typeId
Integer typeNatureId = 56; // Integer | typeNatureId
try {
    apiInstance.listElementsUsingGET(orgId, patientId, since, typeId, typeNatureId);
} catch (ApiException e) {
    System.err.println("Exception when calling SelementcontrollerApi#listElementsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **since** | **String**| sinceDate |
 **typeId** | **Integer**| typeId | [optional]
 **typeNatureId** | **Integer**| typeNatureId | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showElementAsPdf2UsingGET"></a>
# **showElementAsPdf2UsingGET**
> List&lt;byte[]&gt; showElementAsPdf2UsingGET(orgId, patientId, elementId)

showElementAsPdf2

showElementAsPdf2

### Example
```java
// Import classes:
//import io.swagger.client.api.SelementcontrollerApi;

SelementcontrollerApi apiInstance = new SelementcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long elementId = 789L; // Long | elementId
try {
    List<byte[]> result = apiInstance.showElementAsPdf2UsingGET(orgId, patientId, elementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelementcontrollerApi#showElementAsPdf2UsingGET");
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

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="showElementAsPdfUsingGET"></a>
# **showElementAsPdfUsingGET**
> List&lt;byte[]&gt; showElementAsPdfUsingGET(orgId, patientId, elementId)

showElementAsPdf

showElementAsPdf

### Example
```java
// Import classes:
//import io.swagger.client.api.SelementcontrollerApi;

SelementcontrollerApi apiInstance = new SelementcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long elementId = 789L; // Long | elementId
try {
    List<byte[]> result = apiInstance.showElementAsPdfUsingGET(orgId, patientId, elementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelementcontrollerApi#showElementAsPdfUsingGET");
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

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="showElementHistoryUsingGET"></a>
# **showElementHistoryUsingGET**
> String showElementHistoryUsingGET(orgId, patientId, elementId)

showElementHistory

showElementHistory

### Example
```java
// Import classes:
//import io.swagger.client.api.SelementcontrollerApi;

SelementcontrollerApi apiInstance = new SelementcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long elementId = 789L; // Long | elementId
try {
    String result = apiInstance.showElementHistoryUsingGET(orgId, patientId, elementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelementcontrollerApi#showElementHistoryUsingGET");
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

<a name="showElementRevisionUsingGET"></a>
# **showElementRevisionUsingGET**
> String showElementRevisionUsingGET(orgId, patientId, elementId, revision)

showElementRevision

showElementRevision

### Example
```java
// Import classes:
//import io.swagger.client.api.SelementcontrollerApi;

SelementcontrollerApi apiInstance = new SelementcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long elementId = 789L; // Long | elementId
Integer revision = 56; // Integer | revision
try {
    String result = apiInstance.showElementRevisionUsingGET(orgId, patientId, elementId, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelementcontrollerApi#showElementRevisionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **elementId** | **Long**| elementId |
 **revision** | **Integer**| revision |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showElementUsingGET"></a>
# **showElementUsingGET**
> String showElementUsingGET(orgId, patientId, elementId)

showElement

showElement

### Example
```java
// Import classes:
//import io.swagger.client.api.SelementcontrollerApi;

SelementcontrollerApi apiInstance = new SelementcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long elementId = 789L; // Long | elementId
try {
    String result = apiInstance.showElementUsingGET(orgId, patientId, elementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelementcontrollerApi#showElementUsingGET");
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

<a name="writeElementUsingPOST"></a>
# **writeElementUsingPOST**
> String writeElementUsingPOST(orgId, patientId, json)

writeElement

writeElement

### Example
```java
// Import classes:
//import io.swagger.client.api.SelementcontrollerApi;

SelementcontrollerApi apiInstance = new SelementcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
String json = "json_example"; // String | json
try {
    String result = apiInstance.writeElementUsingPOST(orgId, patientId, json);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelementcontrollerApi#writeElementUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **json** | **String**| json |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

