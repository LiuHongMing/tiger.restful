package com.tiger.restful.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceFacade {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    public void addUserBook() throws Exception {
        try {
            bookService.addBookSpringPropagateNested();
        } catch (Exception e) {
            e.printStackTrace();
        }

        userService.addUser();
    }

}
