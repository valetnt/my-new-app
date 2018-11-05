# SorgarticlecontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFromJsonUsingDELETE**](SorgarticlecontrollerApi.md#deleteFromJsonUsingDELETE) | **DELETE** /orgs/{orgId}/articles/{phar} | deleteFromJson
[**listJsonUsingDELETE**](SorgarticlecontrollerApi.md#listJsonUsingDELETE) | **DELETE** /orgs/{orgId}/articles | listJson
[**listJsonUsingGET**](SorgarticlecontrollerApi.md#listJsonUsingGET) | **GET** /orgs/{orgId}/articles | listJson
[**listJsonUsingOPTIONS**](SorgarticlecontrollerApi.md#listJsonUsingOPTIONS) | **OPTIONS** /orgs/{orgId}/articles | listJson
[**listJsonUsingPATCH**](SorgarticlecontrollerApi.md#listJsonUsingPATCH) | **PATCH** /orgs/{orgId}/articles | listJson
[**listJsonUsingPOST**](SorgarticlecontrollerApi.md#listJsonUsingPOST) | **POST** /orgs/{orgId}/articles | listJson
[**listJsonUsingPUT**](SorgarticlecontrollerApi.md#listJsonUsingPUT) | **PUT** /orgs/{orgId}/articles | listJson


<a name="deleteFromJsonUsingDELETE"></a>
# **deleteFromJsonUsingDELETE**
> String deleteFromJsonUsingDELETE(orgId, phar)

deleteFromJson

deleteFromJson

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgarticlecontrollerApi;

SorgarticlecontrollerApi apiInstance = new SorgarticlecontrollerApi();
Long orgId = 789L; // Long | orgId
String phar = "phar_example"; // String | phar
try {
    String result = apiInstance.deleteFromJsonUsingDELETE(orgId, phar);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgarticlecontrollerApi#deleteFromJsonUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **phar** | **String**| phar |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listJsonUsingDELETE"></a>
# **listJsonUsingDELETE**
> String listJsonUsingDELETE(orgId)

listJson

listJson

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgarticlecontrollerApi;

SorgarticlecontrollerApi apiInstance = new SorgarticlecontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listJsonUsingDELETE(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgarticlecontrollerApi#listJsonUsingDELETE");
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

<a name="listJsonUsingGET"></a>
# **listJsonUsingGET**
> String listJsonUsingGET(orgId)

listJson

listJson

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgarticlecontrollerApi;

SorgarticlecontrollerApi apiInstance = new SorgarticlecontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listJsonUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgarticlecontrollerApi#listJsonUsingGET");
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

<a name="listJsonUsingOPTIONS"></a>
# **listJsonUsingOPTIONS**
> String listJsonUsingOPTIONS(orgId)

listJson

listJson

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgarticlecontrollerApi;

SorgarticlecontrollerApi apiInstance = new SorgarticlecontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listJsonUsingOPTIONS(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgarticlecontrollerApi#listJsonUsingOPTIONS");
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

<a name="listJsonUsingPATCH"></a>
# **listJsonUsingPATCH**
> String listJsonUsingPATCH(orgId)

listJson

listJson

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgarticlecontrollerApi;

SorgarticlecontrollerApi apiInstance = new SorgarticlecontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listJsonUsingPATCH(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgarticlecontrollerApi#listJsonUsingPATCH");
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

<a name="listJsonUsingPOST"></a>
# **listJsonUsingPOST**
> String listJsonUsingPOST(orgId)

listJson

listJson

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgarticlecontrollerApi;

SorgarticlecontrollerApi apiInstance = new SorgarticlecontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listJsonUsingPOST(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgarticlecontrollerApi#listJsonUsingPOST");
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

<a name="listJsonUsingPUT"></a>
# **listJsonUsingPUT**
> String listJsonUsingPUT(orgId)

listJson

listJson

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgarticlecontrollerApi;

SorgarticlecontrollerApi apiInstance = new SorgarticlecontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listJsonUsingPUT(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgarticlecontrollerApi#listJsonUsingPUT");
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

