package com.tiger.restful.service.impl;

import com.tiger.restful.mapper.TBookMapper;
import com.tiger.restful.mapper.TUserMapper;
import com.tiger.restful.mapper.model.TBook;
import com.tiger.restful.mapper.model.TUser;
import com.tiger.restful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TUserMapper userMapper;

    @Autowired
    private TBookMapper bookMapper;


    public void addUser() throws Exception {
        TUser user = new TUser();
        user.setName("addUser-duck");
        userMapper.insert(user);

//        TBook book = new TBook();
//        book.setId(1);
//        book.setName("addUser-addBook-duck-j2ee");
//        bookMapper.insert(book);
    }

}
