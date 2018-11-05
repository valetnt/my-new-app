# SattachmentcontrollerApi

All URIs are relative to *https://localhost:8080/smis2-core*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAttachmentUsingPOST**](SattachmentcontrollerApi.md#createAttachmentUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments | createAttachment
[**deleteAttachmentUsingDELETE**](SattachmentcontrollerApi.md#deleteAttachmentUsingDELETE) | **DELETE** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments/{attachmentId} | deleteAttachment
[**listAttachmentsUsingGET**](SattachmentcontrollerApi.md#listAttachmentsUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments | listAttachments
[**showAttachmentFile2UsingGET**](SattachmentcontrollerApi.md#showAttachmentFile2UsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments/{attachmentId}/file/{fileName} | showAttachmentFile2
[**showAttachmentFileUsingGET**](SattachmentcontrollerApi.md#showAttachmentFileUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments/{attachmentId}/file | showAttachmentFile
[**showAttachmentUsingGET**](SattachmentcontrollerApi.md#showAttachmentUsingGET) | **GET** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments/{attachmentId} | showAttachment
[**updateAttachmentUsingPOST**](SattachmentcontrollerApi.md#updateAttachmentUsingPOST) | **POST** /orgs/{orgId}/patients/{patientId}/elements/{elementId}/attachments/{attachmentId} | updateAttachment


<a name="createAttachmentUsingPOST"></a>
# **createAttachmentUsingPOST**
> String createAttachmentUsingPOST(orgId, patientId, elementId, file)

createAttachment

createAttachment

### Example
```java
// Import classes:
//import io.swagger.client.api.SattachmentcontrollerApi;

SattachmentcontrollerApi apiInstance = new SattachmentcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long elementId = 789L; // Long | elementId
ModelObject file = new ModelObject(); // ModelObject | file
try {
    String result = apiInstance.createAttachmentUsingPOST(orgId, patientId, elementId, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SattachmentcontrollerApi#createAttachmentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **elementId** | **Long**| elementId |
 **file** | [**ModelObject**](.md)| file |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="deleteAttachmentUsingDELETE"></a>
# **deleteAttachmentUsingDELETE**
> String deleteAttachmentUsingDELETE(orgId, patientId, elementId, attachmentId)

deleteAttachment

deleteAttachment

### Example
```java
// Import classes:
//import io.swagger.client.api.SattachmentcontrollerApi;

SattachmentcontrollerApi apiInstance = new SattachmentcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long elementId = 789L; // Long | elementId
Integer attachmentId = 56; // Integer | attachmentId
try {
    String result = apiInstance.deleteAttachmentUsingDELETE(orgId, patientId, elementId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SattachmentcontrollerApi#deleteAttachmentUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **elementId** | **Long**| elementId |
 **attachmentId** | **Integer**| attachmentId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listAttachmentsUsingGET"></a>
# **listAttachmentsUsingGET**
> String listAttachmentsUsingGET(elementId)

listAttachments

listAttachments

### Example
```java
// Import classes:
//import io.swagger.client.api.SattachmentcontrollerApi;

SattachmentcontrollerApi apiInstance = new SattachmentcontrollerApi();
Long elementId = 789L; // Long | elementId
try {
    String result = apiInstance.listAttachmentsUsingGET(elementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SattachmentcontrollerApi#listAttachmentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elementId** | **Long**| elementId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showAttachmentFile2UsingGET"></a>
# **showAttachmentFile2UsingGET**
> List&lt;byte[]&gt; showAttachmentFile2UsingGET(orgId, elementId, attachmentId)

showAttachmentFile2

showAttachmentFile2

### Example
```java
// Import classes:
//import io.swagger.client.api.SattachmentcontrollerApi;

SattachmentcontrollerApi apiInstance = new SattachmentcontrollerApi();
Long orgId = 789L; // Long | orgId
Long elementId = 789L; // Long | elementId
Integer attachmentId = 56; // Integer | attachmentId
try {
    List<byte[]> result = apiInstance.showAttachmentFile2UsingGET(orgId, elementId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SattachmentcontrollerApi#showAttachmentFile2UsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **elementId** | **Long**| elementId |
 **attachmentId** | **Integer**| attachmentId |

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="showAttachmentFileUsingGET"></a>
# **showAttachmentFileUsingGET**
> List&lt;byte[]&gt; showAttachmentFileUsingGET(orgId, elementId, attachmentId)

showAttachmentFile

showAttachmentFile

### Example
```java
// Import classes:
//import io.swagger.client.api.SattachmentcontrollerApi;

SattachmentcontrollerApi apiInstance = new SattachmentcontrollerApi();
Long orgId = 789L; // Long | orgId
Long elementId = 789L; // Long | elementId
Integer attachmentId = 56; // Integer | attachmentId
try {
    List<byte[]> result = apiInstance.showAttachmentFileUsingGET(orgId, elementId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SattachmentcontrollerApi#showAttachmentFileUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **elementId** | **Long**| elementId |
 **attachmentId** | **Integer**| attachmentId |

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="showAttachmentUsingGET"></a>
# **showAttachmentUsingGET**
> String showAttachmentUsingGET(elementId, attachmentId)

showAttachment

showAttachment

### Example
```java
// Import classes:
//import io.swagger.client.api.SattachmentcontrollerApi;

SattachmentcontrollerApi apiInstance = new SattachmentcontrollerApi();
Long elementId = 789L; // Long | elId
Integer attachmentId = 56; // Integer | attachmentId
try {
    String result = apiInstance.showAttachmentUsingGET(elementId, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SattachmentcontrollerApi#showAttachmentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **elementId** | **Long**| elId |
 **attachmentId** | **Integer**| attachmentId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAttachmentUsingPOST"></a>
# **updateAttachmentUsingPOST**
> String updateAttachmentUsingPOST(orgId, patientId, elementId, attachmentId, file)

updateAttachment

updateAttachment

### Example
```java
// Import classes:
//import io.swagger.client.api.SattachmentcontrollerApi;

SattachmentcontrollerApi apiInstance = new SattachmentcontrollerApi();
Long orgId = 789L; // Long | orgId
Long patientId = 789L; // Long | patientId
Long elementId = 789L; // Long | elementId
Integer attachmentId = 56; // Integer | attachmentId
ModelObject file = new ModelObject(); // ModelObject | file
try {
    String result = apiInstance.updateAttachmentUsingPOST(orgId, patientId, elementId, attachmentId, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SattachmentcontrollerApi#updateAttachmentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgId** | **Long**| orgId |
 **patientId** | **Long**| patientId |
 **elementId** | **Long**| elementId |
 **attachmentId** | **Integer**| attachmentId |
 **file** | [**ModelObject**](.md)| file |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

