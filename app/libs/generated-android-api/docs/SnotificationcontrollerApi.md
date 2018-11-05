# SnotificationcontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUserNotificationConfigsUsingGET**](SnotificationcontrollerApi.md#listUserNotificationConfigsUsingGET) | **GET** /orgs/{orgId}/users/{userId}/notificationconfigs | listUserNotificationConfigs
[**writeNotificationConfigsUsingPOST**](SnotificationcontrollerApi.md#writeNotificationConfigsUsingPOST) | **POST** /orgs/{orgId}/users/{userId}/notificationconfigs | writeNotificationConfigs


<a name="listUserNotificationConfigsUsingGET"></a>
# **listUserNotificationConfigsUsingGET**
> String listUserNotificationConfigsUsingGET(orgId, userId)

listUserNotificationConfigs

listUserNotificationConfigs

### Example
```java
// Import classes:
//import io.swagger.client.api.SnotificationcontrollerApi;

SnotificationcontrollerApi apiInstance = new SnotificationcontrollerApi();
Long orgId = 789L; // Long | orgId
Long userId = 789L; // Long | userId
try {
    String result = apiInstance.listUserNotificationConfigsUsingGET(orgId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnotificationcontrollerApi#listUserNotificationConfigsUsingGET");
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

<a name="writeNotificationConfigsUsingPOST"></a>
# **writeNotificationConfigsUsingPOST**
> String writeNotificationConfigsUsingPOST(json, orgId)

writeNotificationConfigs

writeNotificationConfigs

### Example
```java
// Import classes:
//import io.swagger.client.api.SnotificationcontrollerApi;

SnotificationcontrollerApi apiInstance = new SnotificationcontrollerApi();
String json = "json_example"; // String | json
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.writeNotificationConfigsUsingPOST(json, orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnotificationcontrollerApi#writeNotificationConfigsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json** | **String**| json |
 **orgId** | **Long**| orgId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

