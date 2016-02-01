package com.tiger.restful.api.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("error")
public class ErrorResource {

    @Path("404")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String error404() {
        return "404";
    }

}
