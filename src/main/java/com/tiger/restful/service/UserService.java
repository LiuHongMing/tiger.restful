package com.tiger.restful.service;

import com.tiger.restful.mapper.TUserMapper;
import com.tiger.restful.mapper.model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private TUserMapper userMapper;

    public int addUser() {
        TUser user = new TUser();
        user.setName("duck");
        return userMapper.insert(user);
    }

}
