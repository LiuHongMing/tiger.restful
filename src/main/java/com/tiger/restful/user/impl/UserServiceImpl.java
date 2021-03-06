package com.tiger.restful.user.impl;

import com.tiger.restful.service.UserService;
import com.tiger.restful.user.mapper.TBookMapper;
import com.tiger.restful.user.mapper.TUserMapper;
import com.tiger.restful.user.model.TBook;
import com.tiger.restful.user.model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TUserMapper userMapper;

    @Autowired
    private TBookMapper bookMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addUser() throws Exception {
        TUser user = new TUser();
        user.setName("addUser-duck");
        userMapper.insert(user);

        TBook book = new TBook();
        book.setId(1);
        book.setName("addUser-addBook-duck-j2ee");
        bookMapper.insert(book);
    }

}
