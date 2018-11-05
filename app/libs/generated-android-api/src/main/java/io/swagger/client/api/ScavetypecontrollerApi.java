/**
 * SMIS2-CORE REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ScavetypecontrollerApi {
  String basePath = "https://localhost:8080/smis2-core";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * listCaveTypes
  * listCaveTypes
   * @param orgId orgId
   * @return String
  */
  public String listCaveTypesUsingGET (Long orgId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'orgId' is set
    if (orgId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orgId' when calling listCaveTypesUsingGET",
        new ApiException(400, "Missing the required parameter 'orgId' when calling listCaveTypesUsingGET"));
    }

    // create path and map variables
    String path = "/orgs/{orgId}/lookups/caveTypes".replaceAll("\\{" + "orgId" + "\\}", apiInvoker.escapeString(orgId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * listCaveTypes
   * listCaveTypes
   * @param orgId orgId
  */
  public void listCaveTypesUsingGET (Long orgId, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'orgId' is set
    if (orgId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orgId' when calling listCaveTypesUsingGET",
        new ApiException(400, "Missing the required parameter 'orgId' when calling listCaveTypesUsingGET"));
    }

    // create path and map variables
    String path = "/orgs/{orgId}/lookups/caveTypes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "orgId" + "\\}", apiInvoker.escapeString(orgId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * showCaveType
  * showCaveType
   * @param orgId orgId
   * @param typeId typeId
   * @return String
  */
  public String showCaveTypeUsingGET (Long orgId, Long typeId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'orgId' is set
    if (orgId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orgId' when calling showCaveTypeUsingGET",
        new ApiException(400, "Missing the required parameter 'orgId' when calling showCaveTypeUsingGET"));
    }
    // verify the required parameter 'typeId' is set
    if (typeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'typeId' when calling showCaveTypeUsingGET",
        new ApiException(400, "Missing the required parameter 'typeId' when calling showCaveTypeUsingGET"));
    }

    // create path and map variables
    String path = "/orgs/{orgId}/lookups/caveTypes/{typeId}".replaceAll("\\{" + "orgId" + "\\}", apiInvoker.escapeString(orgId.toString())).replaceAll("\\{" + "typeId" + "\\}", apiInvoker.escapeString(typeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * showCaveType
   * showCaveType
   * @param orgId orgId   * @param typeId typeId
  */
  public void showCaveTypeUsingGET (Long orgId, Long typeId, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'orgId' is set
    if (orgId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orgId' when calling showCaveTypeUsingGET",
        new ApiException(400, "Missing the required parameter 'orgId' when calling showCaveTypeUsingGET"));
    }
    // verify the required parameter 'typeId' is set
    if (typeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'typeId' when calling showCaveTypeUsingGET",
        new ApiException(400, "Missing the required parameter 'typeId' when calling showCaveTypeUsingGET"));
    }

    // create path and map variables
    String path = "/orgs/{orgId}/lookups/caveTypes/{typeId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "orgId" + "\\}", apiInvoker.escapeString(orgId.toString())).replaceAll("\\{" + "typeId" + "\\}", apiInvoker.escapeString(typeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
