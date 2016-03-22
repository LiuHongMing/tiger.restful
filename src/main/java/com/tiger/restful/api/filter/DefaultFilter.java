package com.tiger.restful.api.filter;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import java.io.IOException;

public class DefaultFilter implements ContainerRequestFilter, ClientRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        System.out.println(requestContext.getRequest().getMethod());
    }

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        System.out.println("*********************************************");
    }
}
