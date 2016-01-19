package com.tiger.restful.service;

public interface BookService {

    void addBook() throws Exception;

    void addBookSpringPropagateMandatory() throws Exception;

    void addBookSpringPropagateNested() throws Exception;

    void addBookSpringPropagateNever() throws Exception;

    void addBookSpringPropagateSupports() throws Exception;

    void addBookSpringPropagateNotSupports() throws Exception;
}
