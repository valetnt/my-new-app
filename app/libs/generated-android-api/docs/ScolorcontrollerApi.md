# ScolorcontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFromJsonUsingPOST**](ScolorcontrollerApi.md#createFromJsonUsingPOST) | **POST** /colors/{orgId} | createFromJson
[**listOrgColorsUsingGET**](ScolorcontrollerApi.md#listOrgColorsUsingGET) | **GET** /colors/{orgId} | listOrgColors


<a name="createFromJsonUsingPOST"></a>
# **createFromJsonUsingPOST**
> String createFromJsonUsingPOST(orgId, json)

createFromJson

createFromJson

### Example
```java
// Import classes:
//import io.swagger.client.api.ScolorcontrollerApi;

ScolorcontrollerApi apiInstance = new ScolorcontrollerApi();
Long orgId = 789L; // Long | orgId
String json = "json_example"; // String | json
try {
    String result = apiInstance.createFromJsonUsingPOST(orgId, json);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScolorcontrollerApi#createFromJsonUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **json** | **String**| json |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listOrgColorsUsingGET"></a>
# **listOrgColorsUsingGET**
> String listOrgColorsUsingGET(orgId)

listOrgColors

listOrgColors

### Example
```java
// Import classes:
//import io.swagger.client.api.ScolorcontrollerApi;

ScolorcontrollerApi apiInstance = new ScolorcontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listOrgColorsUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScolorcontrollerApi#listOrgColorsUsingGET");
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

