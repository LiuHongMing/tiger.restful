package com.tiger.restful.api.exception;

import com.tiger.restful.exception.BaseException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ApiExceptionSupport implements ExceptionMapper<ApiException> {

    @Override
    public Response toResponse(ApiException exception) {
        return Response.ok("Api Argument Exception Caught").build();
    }
}
