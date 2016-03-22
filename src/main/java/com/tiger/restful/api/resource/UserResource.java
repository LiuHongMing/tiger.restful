package com.tiger.restful.api.resource;

import com.tiger.restful.api.exception.ApiException;
import com.tiger.restful.api.view.UserBean;
import com.tiger.restful.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("user")
public class UserResource {

    private static final Logger logger = LogManager.getLogger(UserResource.class);

    @Autowired
    private UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public UserBean getUser4JSON(
            @DefaultValue("1") @QueryParam("val") String val,
            @DefaultValue("jason") @QueryParam("name") String name) {
        logger.info(val + "," + name);
        try {
            userService.addUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        UserBean user = new UserBean();
        user.setId(val);
        user.setName(name + "jrebel");
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
