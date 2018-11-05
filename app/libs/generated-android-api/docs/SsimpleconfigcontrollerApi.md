# SsimpleconfigcontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**showUserConfigUsingGET**](SsimpleconfigcontrollerApi.md#showUserConfigUsingGET) | **GET** /orgs/{orgId}/users/{userId}/config | showUserConfig
[**writeUserConfigUsingPOST**](SsimpleconfigcontrollerApi.md#writeUserConfigUsingPOST) | **POST** /orgs/{orgId}/users/{userId}/config | writeUserConfig


<a name="showUserConfigUsingGET"></a>
# **showUserConfigUsingGET**
> String showUserConfigUsingGET(orgId, userId)

showUserConfig

showUserConfig

### Example
```java
// Import classes:
//import io.swagger.client.api.SsimpleconfigcontrollerApi;

SsimpleconfigcontrollerApi apiInstance = new SsimpleconfigcontrollerApi();
Long orgId = 789L; // Long | orgId
Long userId = 789L; // Long | userId
try {
    String result = apiInstance.showUserConfigUsingGET(orgId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsimpleconfigcontrollerApi#showUserConfigUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **userId** | **Long**| userId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="writeUserConfigUsingPOST"></a>
# **writeUserConfigUsingPOST**
> String writeUserConfigUsingPOST(json, orgId, userId)

writeUserConfig

writeUserConfig

### Example
```java
// Import classes:
//import io.swagger.client.api.SsimpleconfigcontrollerApi;

SsimpleconfigcontrollerApi apiInstance = new SsimpleconfigcontrollerApi();
String json = "json_example"; // String | json
Long orgId = 789L; // Long | orgId
Long userId = 789L; // Long | userId
try {
    String result = apiInstance.writeUserConfigUsingPOST(json, orgId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsimpleconfigcontrollerApi#writeUserConfigUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json** | **String**| json |
 **orgId** | **Long**| orgId |
 **userId** | **Long**| userId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

