# SuserorgcontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeUserPasswordUsingPOST**](SuserorgcontrollerApi.md#changeUserPasswordUsingPOST) | **POST** /orgs/{orgId}/users/{userId}/changePassword | changeUserPassword
[**listDefaultUserRolesUsingGET**](SuserorgcontrollerApi.md#listDefaultUserRolesUsingGET) | **GET** /orgs/{orgId}/users/roles | listDefaultUserRoles
[**listUsersUsingGET**](SuserorgcontrollerApi.md#listUsersUsingGET) | **GET** /orgs/{orgId}/users | listUsers
[**lookupRefDataUsingGET**](SuserorgcontrollerApi.md#lookupRefDataUsingGET) | **GET** /orgs/{orgId}/users/refDataLookup | lookupRefData
[**lookupUsingGET**](SuserorgcontrollerApi.md#lookupUsingGET) | **GET** /orgs/{orgId}/users/lookup | lookup
[**showUserUsingGET**](SuserorgcontrollerApi.md#showUserUsingGET) | **GET** /orgs/{orgId}/users/{userId} | showUser
[**writeUserUsingPOST**](SuserorgcontrollerApi.md#writeUserUsingPOST) | **POST** /orgs/{orgId}/users | writeUser


<a name="changeUserPasswordUsingPOST"></a>
# **changeUserPasswordUsingPOST**
> String changeUserPasswordUsingPOST(orgId, userId, json)

changeUserPassword

changeUserPassword

### Example
```java
// Import classes:
//import io.swagger.client.api.SuserorgcontrollerApi;

SuserorgcontrollerApi apiInstance = new SuserorgcontrollerApi();
Long orgId = 789L; // Long | orgId
Long userId = 789L; // Long | userId
String json = "json_example"; // String | json
try {
    String result = apiInstance.changeUserPasswordUsingPOST(orgId, userId, json);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuserorgcontrollerApi#changeUserPasswordUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **userId** | **Long**| userId |
 **json** | **String**| json |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listDefaultUserRolesUsingGET"></a>
# **listDefaultUserRolesUsingGET**
> String listDefaultUserRolesUsingGET(orgId)

listDefaultUserRoles

listDefaultUserRoles

### Example
```java
// Import classes:
//import io.swagger.client.api.SuserorgcontrollerApi;

SuserorgcontrollerApi apiInstance = new SuserorgcontrollerApi();
Long orgId = 789L; // Long | orgId
try {
    String result = apiInstance.listDefaultUserRolesUsingGET(orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuserorgcontrollerApi#listDefaultUserRolesUsingGET");
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

<a name="listUsersUsingGET"></a>
# **listUsersUsingGET**
> String listUsersUsingGET(orgId, since)

listUsers

listUsers

### Example
```java
// Import classes:
//import io.swagger.client.api.SuserorgcontrollerApi;

SuserorgcontrollerApi apiInstance = new SuserorgcontrollerApi();
Long orgId = 789L; // Long | orgId
String since = "since_example"; // String | sinceDate
try {
    String result = apiInstance.listUsersUsingGET(orgId, since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuserorgcontrollerApi#listUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **since** | **String**| sinceDate | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="lookupRefDataUsingGET"></a>
# **lookupRefDataUsingGET**
> String lookupRefDataUsingGET(orgId, ean, fullName, lastName, firstName, singleResult)

lookupRefData

lookupRefData

### Example
```java
// Import classes:
//import io.swagger.client.api.SuserorgcontrollerApi;

SuserorgcontrollerApi apiInstance = new SuserorgcontrollerApi();
Long orgId = 789L; // Long | orgId
String ean = "ean_example"; // String | ean
String fullName = "fullName_example"; // String | fullName
String lastName = "lastName_example"; // String | lastName
String firstName = "firstName_example"; // String | firstName
Boolean singleResult = true; // Boolean | singleResult
try {
    String result = apiInstance.lookupRefDataUsingGET(orgId, ean, fullName, lastName, firstName, singleResult);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuserorgcontrollerApi#lookupRefDataUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **ean** | **String**| ean |
 **fullName** | **String**| fullName |
 **lastName** | **String**| lastName |
 **firstName** | **String**| firstName |
 **singleResult** | **Boolean**| singleResult | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="lookupUsingGET"></a>
# **lookupUsingGET**
> String lookupUsingGET(orgId, gln)

lookup

lookup

### Example
```java
// Import classes:
//import io.swagger.client.api.SuserorgcontrollerApi;

SuserorgcontrollerApi apiInstance = new SuserorgcontrollerApi();
Long orgId = 789L; // Long | orgId
String gln = "gln_example"; // String | gln
try {
    String result = apiInstance.lookupUsingGET(orgId, gln);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuserorgcontrollerApi#lookupUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **gln** | **String**| gln |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showUserUsingGET"></a>
# **showUserUsingGET**
> String showUserUsingGET(orgId, userId)

showUser

showUser

### Example
```java
// Import classes:
//import io.swagger.client.api.SuserorgcontrollerApi;

SuserorgcontrollerApi apiInstance = new SuserorgcontrollerApi();
Long orgId = 789L; // Long | orgId
Long userId = 789L; // Long | userId
try {
    String result = apiInstance.showUserUsingGET(orgId, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuserorgcontrollerApi#showUserUsingGET");
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

<a name="writeUserUsingPOST"></a>
# **writeUserUsingPOST**
> String writeUserUsingPOST(orgId, json)

writeUser

writeUser

### Example
```java
// Import classes:
//import io.swagger.client.api.SuserorgcontrollerApi;

SuserorgcontrollerApi apiInstance = new SuserorgcontrollerApi();
Long orgId = 789L; // Long | orgId
String json = "json_example"; // String | json
try {
    String result = apiInstance.writeUserUsingPOST(orgId, json);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuserorgcontrollerApi#writeUserUsingPOST");
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

