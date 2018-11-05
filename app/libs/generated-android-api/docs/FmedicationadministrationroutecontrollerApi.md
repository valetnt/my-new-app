# FmedicationadministrationroutecontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMedicationAdministrationRouteByCodeUsingGET**](FmedicationadministrationroutecontrollerApi.md#getMedicationAdministrationRouteByCodeUsingGET) | **GET** /orgs/{orgId}/lookups/medicationadministrations/code/{code} | getMedicationAdministrationRouteByCode
[**listMedicationAdministrationRoutesByTypeUsingGET**](FmedicationadministrationroutecontrollerApi.md#listMedicationAdministrationRoutesByTypeUsingGET) | **GET** /orgs/{orgId}/lookups/medicationadministrations/type/{typeId} | listMedicationAdministrationRoutesByType
[**listMedicationAdministrationRoutesUsingGET**](FmedicationadministrationroutecontrollerApi.md#listMedicationAdministrationRoutesUsingGET) | **GET** /orgs/{orgId}/lookups/medicationadministrations | listMedicationAdministrationRoutes


<a name="getMedicationAdministrationRouteByCodeUsingGET"></a>
# **getMedicationAdministrationRouteByCodeUsingGET**
> String getMedicationAdministrationRouteByCodeUsingGET(orgId, code)

getMedicationAdministrationRouteByCode

getMedicationAdministrationRouteByCode

### Example
```java
// Import classes:
//import io.swagger.client.api.FmedicationadministrationroutecontrollerApi;

FmedicationadministrationroutecontrollerApi apiInstance = new FmedicationadministrationroutecontrollerApi();
Long orgId = 789L; // Long | orgId
String code = "code_example"; // String | code
try {
    String result = apiInstance.getMedicationAdministrationRouteByCodeUsingGET(orgId, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FmedicationadministrationroutecontrollerApi#getMedicationAdministrationRouteByCodeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **code** | **String**| code |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMedicationAdministrationRoutesByTypeUsingGET"></a>
# **listMedicationAdministrationRoutesByTypeUsingGET**
> String listMedicationAdministrationRoutesByTypeUsingGET(orgId, typeId)

listMedicationAdministrationRoutesByType

listMedicationAdministrationRoutesByType

### Example
```java
// Import classes:
//import io.swagger.client.api.FmedicationadministrationroutecontrollerApi;

FmedicationadministrationroutecontrollerApi apiInstance = new FmedicationadministrationroutecontrollerApi();
Long orgId = 789L; // Long | orgId
Long typeId = 789L; // Long | typeId
try {
    String result = apiInstance.listMedicationAdministrationRoutesByTypeUsingGET(orgId, typeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FmedicationadministrationroutecontrollerApi#listMedicationAdministrationRoutesByTypeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **typeId** | **Long**| typeId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMedicationAdministrationRoutesUsingGET"></a>
# **listMedicationAdministrationRoutesUsingGET**
> String listMedicationAdministrationRoutesUsingGET(orgId)

listMedicationAdministrationRoutes

listMedicationAdministrationRoutes

### Example
```java
// Import classes:
//import io.swagger.client.api.FmedicationadministrationroutecontrollerApi;

FmedicationadministrationroutecontrollerApi apiInstance = new FmedicationadministrationroutecontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listMedicationAdministrationRoutesUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FmedicationadministrationroutecontrollerApi#listMedicationAdministrationRoutesUsingGET");
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

