# SorgcontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAllOrgsUsingGET**](SorgcontrollerApi.md#listAllOrgsUsingGET) | **GET** /orgs/all | listAllOrgs
[**listOrgGroupsUsingGET**](SorgcontrollerApi.md#listOrgGroupsUsingGET) | **GET** /orgs/{orgId}/groups | listOrgGroups
[**listOrgRolesUsingGET**](SorgcontrollerApi.md#listOrgRolesUsingGET) | **GET** /orgs/{orgId}/roles | listOrgRoles
[**listOrgsUsingGET**](SorgcontrollerApi.md#listOrgsUsingGET) | **GET** /orgs | listOrgs
[**searchPatientsInAllOrgsUsingGET**](SorgcontrollerApi.md#searchPatientsInAllOrgsUsingGET) | **GET** /orgs/searchPatients | searchPatientsInAllOrgs
[**showOrgUsingGET**](SorgcontrollerApi.md#showOrgUsingGET) | **GET** /orgs/{orgId} | showOrg


<a name="listAllOrgsUsingGET"></a>
# **listAllOrgsUsingGET**
> List&lt;SOrg&gt; listAllOrgsUsingGET()

listAllOrgs

listAllOrgs

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgcontrollerApi;

SorgcontrollerApi apiInstance = new SorgcontrollerApi();
try {
    List<SOrg> result = apiInstance.listAllOrgsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgcontrollerApi#listAllOrgsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SOrg&gt;**](SOrg.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listOrgGroupsUsingGET"></a>
# **listOrgGroupsUsingGET**
> List&lt;SOrgGroup&gt; listOrgGroupsUsingGET(orgId)

listOrgGroups

listOrgGroups

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgcontrollerApi;

SorgcontrollerApi apiInstance = new SorgcontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    List<SOrgGroup> result = apiInstance.listOrgGroupsUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgcontrollerApi#listOrgGroupsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |

### Return type

[**List&lt;SOrgGroup&gt;**](SOrgGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listOrgRolesUsingGET"></a>
# **listOrgRolesUsingGET**
> List&lt;SOrgRole&gt; listOrgRolesUsingGET(orgId)

listOrgRoles

listOrgRoles

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgcontrollerApi;

SorgcontrollerApi apiInstance = new SorgcontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    List<SOrgRole> result = apiInstance.listOrgRolesUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgcontrollerApi#listOrgRolesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |

### Return type

[**List&lt;SOrgRole&gt;**](SOrgRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listOrgsUsingGET"></a>
# **listOrgsUsingGET**
> List&lt;SOrg&gt; listOrgsUsingGET()

listOrgs

listOrgs

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgcontrollerApi;

SorgcontrollerApi apiInstance = new SorgcontrollerApi();
try {
    List<SOrg> result = apiInstance.listOrgsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgcontrollerApi#listOrgsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SOrg&gt;**](SOrg.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchPatientsInAllOrgsUsingGET"></a>
# **searchPatientsInAllOrgsUsingGET**
> searchPatientsInAllOrgsUsingGET(name)

searchPatientsInAllOrgs

searchPatientsInAllOrgs

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgcontrollerApi;

SorgcontrollerApi apiInstance = new SorgcontrollerApi();
String name = "name_example"; // String | name
try {
    apiInstance.searchPatientsInAllOrgsUsingGET(name);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgcontrollerApi#searchPatientsInAllOrgsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showOrgUsingGET"></a>
# **showOrgUsingGET**
> SOrg showOrgUsingGET(orgId)

showOrg

showOrg

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgcontrollerApi;

SorgcontrollerApi apiInstance = new SorgcontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    SOrg result = apiInstance.showOrgUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgcontrollerApi#showOrgUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |

### Return type

[**SOrg**](SOrg.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

