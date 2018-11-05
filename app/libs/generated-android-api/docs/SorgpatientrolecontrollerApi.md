# SorgpatientrolecontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPatientRolesUsingGET**](SorgpatientrolecontrollerApi.md#listPatientRolesUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/roles | listPatientRoles
[**showPatientRoleUsingGET**](SorgpatientrolecontrollerApi.md#showPatientRoleUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/roles/{roleId} | showPatientRole
[**writeElementUsingPOST**](SorgpatientrolecontrollerApi.md#writeElementUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/roles | writeElement


<a name="listPatientRolesUsingGET"></a>
# **listPatientRolesUsingGET**
> String listPatientRolesUsingGET(orgId, patientId)

listPatientRoles

listPatientRoles

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientrolecontrollerApi;

SorgpatientrolecontrollerApi apiInstance = new SorgpatientrolecontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
try {
    String result = apiInstance.listPatientRolesUsingGET(orgId, patientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientrolecontrollerApi#listPatientRolesUsingGET");
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

<a name="showPatientRoleUsingGET"></a>
# **showPatientRoleUsingGET**
> String showPatientRoleUsingGET(orgId, patientId, roleId)

showPatientRole

showPatientRole

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientrolecontrollerApi;

SorgpatientrolecontrollerApi apiInstance = new SorgpatientrolecontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Integer roleId = 56; // Integer | roleId
try {
    String result = apiInstance.showPatientRoleUsingGET(orgId, patientId, roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientrolecontrollerApi#showPatientRoleUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **roleId** | **Integer**| roleId |

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
//import io.swagger.client.api.SorgpatientrolecontrollerApi;

SorgpatientrolecontrollerApi apiInstance = new SorgpatientrolecontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
String json = "json_example"; // String | json
try {
    String result = apiInstance.writeElementUsingPOST(orgId, patientId, json);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientrolecontrollerApi#writeElementUsingPOST");
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

