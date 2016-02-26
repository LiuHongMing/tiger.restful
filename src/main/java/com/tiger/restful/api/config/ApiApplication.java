package com.tiger.restful.api.config;

import org.apache.logging.log4j.jul.LogManager;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

public class ApiApplication extends ResourceConfig {

    private static final Logger LOGGER = new LogManager().getLogger("logging.filter");

    public ApiApplication() {
        packages("com.tiger.restful.api.resource");

        // 注册数据转换器
        register(JacksonJsonProvider.class);

        // logging
        register(new LoggingFilter(LOGGER, false));
    }

}
