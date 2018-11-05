# SorgpatientcontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPatientsUsingGET**](SorgpatientcontrollerApi.md#listPatientsUsingGET) | **GET** /orgs/{orgId}/patients | listPatients
[**mediPlan2UsingGET**](SorgpatientcontrollerApi.md#mediPlan2UsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/mediPlan/{fileName} | mediPlan2
[**mediPlanUsingGET**](SorgpatientcontrollerApi.md#mediPlanUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/mediPlan | mediPlan
[**searchPatientsUsingGET**](SorgpatientcontrollerApi.md#searchPatientsUsingGET) | **GET** /orgs/{orgId}/patients/search | searchPatients
[**showPatientUsingGET**](SorgpatientcontrollerApi.md#showPatientUsingGET) | **GET** /orgs/{orgId}/patients/{patientId} | showPatient
[**writePatientUsingPOST**](SorgpatientcontrollerApi.md#writePatientUsingPOST) | **POST** /orgs/{orgId}/patients | writePatient


<a name="listPatientsUsingGET"></a>
# **listPatientsUsingGET**
> listPatientsUsingGET(orgId, since)

listPatients

listPatients

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientcontrollerApi;

SorgpatientcontrollerApi apiInstance = new SorgpatientcontrollerApi();
Long orgId = 789L; // Long | orgId
String since = "since_example"; // String | sinceDate
try {
    apiInstance.listPatientsUsingGET(orgId, since);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientcontrollerApi#listPatientsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **since** | **String**| sinceDate |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mediPlan2UsingGET"></a>
# **mediPlan2UsingGET**
> List&lt;byte[]&gt; mediPlan2UsingGET(orgId, patientId, dateFrom, dateTo)

mediPlan2

mediPlan2

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientcontrollerApi;

SorgpatientcontrollerApi apiInstance = new SorgpatientcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
String dateFrom = "dateFrom_example"; // String | dateFrom
String dateTo = "dateTo_example"; // String | dateTo
try {
    List<byte[]> result = apiInstance.mediPlan2UsingGET(orgId, patientId, dateFrom, dateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientcontrollerApi#mediPlan2UsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **dateFrom** | **String**| dateFrom | [optional]
 **dateTo** | **String**| dateTo | [optional]

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="mediPlanUsingGET"></a>
# **mediPlanUsingGET**
> List&lt;byte[]&gt; mediPlanUsingGET(orgId, patientId, dateFrom, dateTo)

mediPlan

mediPlan

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientcontrollerApi;

SorgpatientcontrollerApi apiInstance = new SorgpatientcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
String dateFrom = "dateFrom_example"; // String | dateFrom
String dateTo = "dateTo_example"; // String | dateTo
try {
    List<byte[]> result = apiInstance.mediPlanUsingGET(orgId, patientId, dateFrom, dateTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientcontrollerApi#mediPlanUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **dateFrom** | **String**| dateFrom | [optional]
 **dateTo** | **String**| dateTo | [optional]

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="searchPatientsUsingGET"></a>
# **searchPatientsUsingGET**
> searchPatientsUsingGET(orgId, name)

searchPatients

searchPatients

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientcontrollerApi;

SorgpatientcontrollerApi apiInstance = new SorgpatientcontrollerApi();
Long orgId = 789L; // Long | orgId
String name = "name_example"; // String | name
try {
    apiInstance.searchPatientsUsingGET(orgId, name);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientcontrollerApi#searchPatientsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **name** | **String**| name | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showPatientUsingGET"></a>
# **showPatientUsingGET**
> SOrgPatient showPatientUsingGET(orgId, patientId)

showPatient

showPatient

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientcontrollerApi;

SorgpatientcontrollerApi apiInstance = new SorgpatientcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
try {
    SOrgPatient result = apiInstance.showPatientUsingGET(orgId, patientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientcontrollerApi#showPatientUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |

### Return type

[**SOrgPatient**](SOrgPatient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="writePatientUsingPOST"></a>
# **writePatientUsingPOST**
> String writePatientUsingPOST(orgId, json)

writePatient

writePatient

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientcontrollerApi;

SorgpatientcontrollerApi apiInstance = new SorgpatientcontrollerApi();
Long orgId = 789L; // Long | orgId
String json = "json_example"; // String | json
try {
    String result = apiInstance.writePatientUsingPOST(orgId, json);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientcontrollerApi#writePatientUsingPOST");
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

