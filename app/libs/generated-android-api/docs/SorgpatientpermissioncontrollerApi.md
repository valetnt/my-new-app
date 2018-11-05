# SorgpatientpermissioncontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOtherUserPermissionsUsingGET**](SorgpatientpermissioncontrollerApi.md#listOtherUserPermissionsUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/permissions/{userId} | listOtherUserPermissions
[**listPermissionsUsingGET**](SorgpatientpermissioncontrollerApi.md#listPermissionsUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/permissions | listPermissions


<a name="listOtherUserPermissionsUsingGET"></a>
# **listOtherUserPermissionsUsingGET**
> String listOtherUserPermissionsUsingGET(orgId, patientId, userId)

listOtherUserPermissions

listOtherUserPermissions

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientpermissioncontrollerApi;

SorgpatientpermissioncontrollerApi apiInstance = new SorgpatientpermissioncontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long userId = 789L; // Long | userId
try {
    String result = apiInstance.listOtherUserPermissionsUsingGET(orgId, patientId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientpermissioncontrollerApi#listOtherUserPermissionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **userId** | **Long**| userId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPermissionsUsingGET"></a>
# **listPermissionsUsingGET**
> String listPermissionsUsingGET(orgId, patientId)

listPermissions

listPermissions

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientpermissioncontrollerApi;

SorgpatientpermissioncontrollerApi apiInstance = new SorgpatientpermissioncontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
try {
    String result = apiInstance.listPermissionsUsingGET(orgId, patientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientpermissioncontrollerApi#listPermissionsUsingGET");
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

