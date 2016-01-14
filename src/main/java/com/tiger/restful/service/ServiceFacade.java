package com.tiger.restful.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ServiceFacade {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    public void addUserBook() throws Exception {
        userService.addUser();
        bookService.addBook();
    }

}
