# SmessagecontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inboxDeleteMessageUsingDELETE**](SmessagecontrollerApi.md#inboxDeleteMessageUsingDELETE) | **DELETE** /orgs/{orgId}/inbox/{messageId} | inboxDeleteMessage
[**inboxListMessagesUsingGET**](SmessagecontrollerApi.md#inboxListMessagesUsingGET) | **GET** /orgs/{orgId}/inbox | inboxListMessages
[**inboxShowMessageUsingGET**](SmessagecontrollerApi.md#inboxShowMessageUsingGET) | **GET** /orgs/{orgId}/inbox/{messageId} | inboxShowMessage
[**outboxListMessagesUsingGET**](SmessagecontrollerApi.md#outboxListMessagesUsingGET) | **GET** /orgs/{orgId}/outbox | outboxListMessages
[**outboxWriteMessageUsingPOST**](SmessagecontrollerApi.md#outboxWriteMessageUsingPOST) | **POST** /orgs/{orgId}/outbox | outboxWriteMessage


<a name="inboxDeleteMessageUsingDELETE"></a>
# **inboxDeleteMessageUsingDELETE**
> String inboxDeleteMessageUsingDELETE(orgId, messageId)

inboxDeleteMessage

inboxDeleteMessage

### Example
```java
// Import classes:
//import io.swagger.client.api.SmessagecontrollerApi;

SmessagecontrollerApi apiInstance = new SmessagecontrollerApi();
Long orgId = 789L; // Long | orgId
Long messageId = 789L; // Long | msgId
try {
    String result = apiInstance.inboxDeleteMessageUsingDELETE(orgId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmessagecontrollerApi#inboxDeleteMessageUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **messageId** | **Long**| msgId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inboxListMessagesUsingGET"></a>
# **inboxListMessagesUsingGET**
> String inboxListMessagesUsingGET(orgId)

inboxListMessages

inboxListMessages

### Example
```java
// Import classes:
//import io.swagger.client.api.SmessagecontrollerApi;

SmessagecontrollerApi apiInstance = new SmessagecontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.inboxListMessagesUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmessagecontrollerApi#inboxListMessagesUsingGET");
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

<a name="inboxShowMessageUsingGET"></a>
# **inboxShowMessageUsingGET**
> String inboxShowMessageUsingGET(orgId, messageId)

inboxShowMessage

inboxShowMessage

### Example
```java
// Import classes:
//import io.swagger.client.api.SmessagecontrollerApi;

SmessagecontrollerApi apiInstance = new SmessagecontrollerApi();
Long orgId = 789L; // Long | orgId
Long messageId = 789L; // Long | msgId
try {
    String result = apiInstance.inboxShowMessageUsingGET(orgId, messageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmessagecontrollerApi#inboxShowMessageUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **messageId** | **Long**| msgId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="outboxListMessagesUsingGET"></a>
# **outboxListMessagesUsingGET**
> String outboxListMessagesUsingGET(orgId)

outboxListMessages

outboxListMessages

### Example
```java
// Import classes:
//import io.swagger.client.api.SmessagecontrollerApi;

SmessagecontrollerApi apiInstance = new SmessagecontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.outboxListMessagesUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmessagecontrollerApi#outboxListMessagesUsingGET");
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

<a name="outboxWriteMessageUsingPOST"></a>
# **outboxWriteMessageUsingPOST**
> String outboxWriteMessageUsingPOST(json, orgId)

outboxWriteMessage

outboxWriteMessage

### Example
```java
// Import classes:
//import io.swagger.client.api.SmessagecontrollerApi;

SmessagecontrollerApi apiInstance = new SmessagecontrollerApi();
String json = "json_example"; // String | json
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.outboxWriteMessageUsingPOST(json, orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmessagecontrollerApi#outboxWriteMessageUsingPOST");
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

