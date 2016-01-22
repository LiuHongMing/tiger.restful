package com.tiger.restful.user.impl;

import com.tiger.restful.service.BookService;
import com.tiger.restful.user.mapper.TBookMapper;
import com.tiger.restful.user.model.TBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private TBookMapper bookMapper;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void addBook() throws Exception {
        TBook book = new TBook();
        book.setName("addBook-duck-j2ee");
        bookMapper.insert(book);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public void addBookSpringPropagateMandatory() throws Exception {
        addBook();
    }

    @Transactional(propagation = Propagation.NESTED)
    public void addBookSpringPropagateNested() throws Exception {
        addBook();
    }

    @Transactional(propagation = Propagation.NEVER)
    public void addBookSpringPropagateNever() throws Exception {
        addBook();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void addBookSpringPropagateSupports() throws Exception {
        addBook();
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void addBookSpringPropagateNotSupports() throws Exception {
        addBook();
    }
}
