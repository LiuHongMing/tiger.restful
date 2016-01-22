package com.tiger.restful.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceFacade {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @Autowired
    private OrderService orderService;

    public void addUserBook() throws Exception {
        userService.addUser();
        bookService.addBook();
        orderService.addOrder();
    }

}
