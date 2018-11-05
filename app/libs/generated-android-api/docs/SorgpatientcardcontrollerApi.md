# SorgpatientcardcontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePatientCardUsingDELETE**](SorgpatientcardcontrollerApi.md#deletePatientCardUsingDELETE) | **DELETE** /orgs/{orgId}/patients/{patientId}/cards | deletePatientCard
[**listCardsUsingGET**](SorgpatientcardcontrollerApi.md#listCardsUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/cards | listCards
[**writePatientCardUsingPOST**](SorgpatientcardcontrollerApi.md#writePatientCardUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/cards | writePatientCard


<a name="deletePatientCardUsingDELETE"></a>
# **deletePatientCardUsingDELETE**
> String deletePatientCardUsingDELETE(orgId, patientId, json)

deletePatientCard

deletePatientCard

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientcardcontrollerApi;

SorgpatientcardcontrollerApi apiInstance = new SorgpatientcardcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
String json = "json_example"; // String | json
try {
    String result = apiInstance.deletePatientCardUsingDELETE(orgId, patientId, json);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientcardcontrollerApi#deletePatientCardUsingDELETE");
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

<a name="listCardsUsingGET"></a>
# **listCardsUsingGET**
> String listCardsUsingGET(orgId, patientId)

listCards

listCards

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientcardcontrollerApi;

SorgpatientcardcontrollerApi apiInstance = new SorgpatientcardcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
try {
    String result = apiInstance.listCardsUsingGET(orgId, patientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientcardcontrollerApi#listCardsUsingGET");
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

<a name="writePatientCardUsingPOST"></a>
# **writePatientCardUsingPOST**
> String writePatientCardUsingPOST(orgId, patientId, json)

writePatientCard

writePatientCard

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientcardcontrollerApi;

SorgpatientcardcontrollerApi apiInstance = new SorgpatientcardcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
String json = "json_example"; // String | json
try {
    String result = apiInstance.writePatientCardUsingPOST(orgId, patientId, json);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientcardcontrollerApi#writePatientCardUsingPOST");
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

