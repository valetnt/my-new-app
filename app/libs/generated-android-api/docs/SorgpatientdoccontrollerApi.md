# SorgpatientdoccontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocumentUsingPOST**](SorgpatientdoccontrollerApi.md#createDocumentUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/documents | createDocument
[**deleteDocumentUsingDELETE**](SorgpatientdoccontrollerApi.md#deleteDocumentUsingDELETE) | **DELETE** /orgs/{orgId}/patients/{patientId}/documents/{docId} | deleteDocument
[**listDocumentsUsingDELETE**](SorgpatientdoccontrollerApi.md#listDocumentsUsingDELETE) | **DELETE** /orgs/{orgId}/patients/{patientId}/documents | listDocuments
[**listDocumentsUsingGET**](SorgpatientdoccontrollerApi.md#listDocumentsUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/documents | listDocuments
[**listDocumentsUsingOPTIONS**](SorgpatientdoccontrollerApi.md#listDocumentsUsingOPTIONS) | **OPTIONS** /orgs/{orgId}/patients/{patientId}/documents | listDocuments
[**listDocumentsUsingPATCH**](SorgpatientdoccontrollerApi.md#listDocumentsUsingPATCH) | **PATCH** /orgs/{orgId}/patients/{patientId}/documents | listDocuments
[**listDocumentsUsingPUT**](SorgpatientdoccontrollerApi.md#listDocumentsUsingPUT) | **PUT** /orgs/{orgId}/patients/{patientId}/documents | listDocuments
[**showDocumentFile2UsingGET**](SorgpatientdoccontrollerApi.md#showDocumentFile2UsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/documents/{docId}/file/{fileName} | showDocumentFile2
[**showDocumentFileUsingGET**](SorgpatientdoccontrollerApi.md#showDocumentFileUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/documents/{docId}/file | showDocumentFile
[**showDocumentUsingGET**](SorgpatientdoccontrollerApi.md#showDocumentUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/documents/{docId} | showDocument
[**updateDocumentUsingPOST**](SorgpatientdoccontrollerApi.md#updateDocumentUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/documents/{docId} | updateDocument


<a name="createDocumentUsingPOST"></a>
# **createDocumentUsingPOST**
> String createDocumentUsingPOST(orgId, patientId, file)

createDocument

createDocument

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientdoccontrollerApi;

SorgpatientdoccontrollerApi apiInstance = new SorgpatientdoccontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
ModelObject file = new ModelObject(); // ModelObject | file
try {
    String result = apiInstance.createDocumentUsingPOST(orgId, patientId, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientdoccontrollerApi#createDocumentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **file** | [**ModelObject**](.md)| file |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="deleteDocumentUsingDELETE"></a>
# **deleteDocumentUsingDELETE**
> String deleteDocumentUsingDELETE(orgId, patientId, docId)

deleteDocument

deleteDocument

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientdoccontrollerApi;

SorgpatientdoccontrollerApi apiInstance = new SorgpatientdoccontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long docId = 789L; // Long | docId
try {
    String result = apiInstance.deleteDocumentUsingDELETE(orgId, patientId, docId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientdoccontrollerApi#deleteDocumentUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **docId** | **Long**| docId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listDocumentsUsingDELETE"></a>
# **listDocumentsUsingDELETE**
> String listDocumentsUsingDELETE(orgId, patientId)

listDocuments

listDocuments

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientdoccontrollerApi;

SorgpatientdoccontrollerApi apiInstance = new SorgpatientdoccontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
try {
    String result = apiInstance.listDocumentsUsingDELETE(orgId, patientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientdoccontrollerApi#listDocumentsUsingDELETE");
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

<a name="listDocumentsUsingGET"></a>
# **listDocumentsUsingGET**
> String listDocumentsUsingGET(orgId, patientId)

listDocuments

listDocuments

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientdoccontrollerApi;

SorgpatientdoccontrollerApi apiInstance = new SorgpatientdoccontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
try {
    String result = apiInstance.listDocumentsUsingGET(orgId, patientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientdoccontrollerApi#listDocumentsUsingGET");
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

<a name="listDocumentsUsingOPTIONS"></a>
# **listDocumentsUsingOPTIONS**
> String listDocumentsUsingOPTIONS(orgId, patientId)

listDocuments

listDocuments

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientdoccontrollerApi;

SorgpatientdoccontrollerApi apiInstance = new SorgpatientdoccontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
try {
    String result = apiInstance.listDocumentsUsingOPTIONS(orgId, patientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientdoccontrollerApi#listDocumentsUsingOPTIONS");
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

<a name="listDocumentsUsingPATCH"></a>
# **listDocumentsUsingPATCH**
> String listDocumentsUsingPATCH(orgId, patientId)

listDocuments

listDocuments

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientdoccontrollerApi;

SorgpatientdoccontrollerApi apiInstance = new SorgpatientdoccontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
try {
    String result = apiInstance.listDocumentsUsingPATCH(orgId, patientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientdoccontrollerApi#listDocumentsUsingPATCH");
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

<a name="listDocumentsUsingPUT"></a>
# **listDocumentsUsingPUT**
> String listDocumentsUsingPUT(orgId, patientId)

listDocuments

listDocuments

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientdoccontrollerApi;

SorgpatientdoccontrollerApi apiInstance = new SorgpatientdoccontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
try {
    String result = apiInstance.listDocumentsUsingPUT(orgId, patientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientdoccontrollerApi#listDocumentsUsingPUT");
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

<a name="showDocumentFile2UsingGET"></a>
# **showDocumentFile2UsingGET**
> List&lt;byte[]&gt; showDocumentFile2UsingGET(orgId, patientId, docId)

showDocumentFile2

showDocumentFile2

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientdoccontrollerApi;

SorgpatientdoccontrollerApi apiInstance = new SorgpatientdoccontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long docId = 789L; // Long | docId
try {
    List<byte[]> result = apiInstance.showDocumentFile2UsingGET(orgId, patientId, docId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientdoccontrollerApi#showDocumentFile2UsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **docId** | **Long**| docId |

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="showDocumentFileUsingGET"></a>
# **showDocumentFileUsingGET**
> List&lt;byte[]&gt; showDocumentFileUsingGET(orgId, patientId, docId)

showDocumentFile

showDocumentFile

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientdoccontrollerApi;

SorgpatientdoccontrollerApi apiInstance = new SorgpatientdoccontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long docId = 789L; // Long | docId
try {
    List<byte[]> result = apiInstance.showDocumentFileUsingGET(orgId, patientId, docId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientdoccontrollerApi#showDocumentFileUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **docId** | **Long**| docId |

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="showDocumentUsingGET"></a>
# **showDocumentUsingGET**
> String showDocumentUsingGET(orgId, patientId, docId)

showDocument

showDocument

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientdoccontrollerApi;

SorgpatientdoccontrollerApi apiInstance = new SorgpatientdoccontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long docId = 789L; // Long | docId
try {
    String result = apiInstance.showDocumentUsingGET(orgId, patientId, docId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientdoccontrollerApi#showDocumentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **docId** | **Long**| docId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDocumentUsingPOST"></a>
# **updateDocumentUsingPOST**
> String updateDocumentUsingPOST(orgId, patientId, docId, file)

updateDocument

updateDocument

### Example
```java
// Import classes:
//import io.swagger.client.api.SorgpatientdoccontrollerApi;

SorgpatientdoccontrollerApi apiInstance = new SorgpatientdoccontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long docId = 789L; // Long | docId
ModelObject file = new ModelObject(); // ModelObject | file
try {
    String result = apiInstance.updateDocumentUsingPOST(orgId, patientId, docId, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SorgpatientdoccontrollerApi#updateDocumentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **docId** | **Long**| docId |
 **file** | [**ModelObject**](.md)| file |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

