package com.tiger.restful.api.resource;

import com.tiger.restful.api.view.UserBean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("user")
public class UserResource {

    private static final Logger logger = LogManager.getLogger(UserResource.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public UserBean getUser4JSON(
            @DefaultValue("1") @QueryParam("val") String val,
            @DefaultValue("jason") @QueryParam("name") String name) {
        logger.info(val + "," + name);
        UserBean user = new UserBean();
        user.setId(val);
        user.setName(name);
        return user;
    }

    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public UserBean getUser4XML(@PathParam("id") String id) {
        UserBean user = new UserBean();
        user.setId(id);
        user.setName("jason");
        return user;
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public UserBean newUser(@FormParam("user") UserBean userBean) {
        return userBean;
    }

}
