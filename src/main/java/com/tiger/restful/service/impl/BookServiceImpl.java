package com.tiger.restful.service.impl;

import com.tiger.restful.mapper.TBookMapper;
import com.tiger.restful.mapper.model.TBook;
import com.tiger.restful.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {

    @Autowired
    private TBookMapper bookMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void addBook() throws Exception {
        TBook book = new TBook();
        book.setName("addBook-duck-j2ee");
        bookMapper.insert(book);
        throw new RuntimeException("throw runtime exception in transaction");
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public void addBookSpringPropagateMandatory() throws Exception {
        addBook();
    }

    @Transactional(propagation = Propagation.NESTED)
    public void addBookSpringPropagateNested() throws Exception {
        addBook();
    }

}
