package com.tiger.restful.api.config;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

public class ApiApplication extends ResourceConfig {

    public ApiApplication() {
        packages("com.tiger.restful.api.resource");

        // 注册数据转换器
        register(JacksonJsonProvider.class);

        // logging
        register(LoggingFilter.class);
    }

}
