# VekaproxycontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendVeKaQueryUsingPOST**](VekaproxycontrollerApi.md#sendVeKaQueryUsingPOST) | **POST** /veka | sendVeKaQuery


<a name="sendVeKaQueryUsingPOST"></a>
# **sendVeKaQueryUsingPOST**
> String sendVeKaQueryUsingPOST(json)

sendVeKaQuery

sendVeKaQuery

### Example
```java
// Import classes:
//import io.swagger.client.api.VekaproxycontrollerApi;

VekaproxycontrollerApi apiInstance = new VekaproxycontrollerApi();
String json = "json_example"; // String | json
try {
    String result = apiInstance.sendVeKaQueryUsingPOST(json);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VekaproxycontrollerApi#sendVeKaQueryUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json** | **String**| json |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

