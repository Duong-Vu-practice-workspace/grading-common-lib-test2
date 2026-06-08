package com.ptit.grading.common.client;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import feign.Response;

import java.util.Map;

public interface SubmissionClient {
    @RequestLine("GET {path}")
    Response get(@Param("path") String path, @QueryMap Map<String, Object> queryParams);

    @RequestLine("POST {path}")
    @Headers("Content-Type: application/json")
    Response post(@Param("path") String path, Object body);

    @RequestLine("PUT {path}")
    @Headers("Content-Type: application/json")
    Response put(@Param("path") String path, Object body);

    @RequestLine("DELETE {path}")
    Response delete(@Param("path") String path);

    @RequestLine("PATCH {path}")
    @Headers("Content-Type: application/json")
    Response patch(@Param("path") String path, Object body);
}
