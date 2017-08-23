package com.test.dao;

import org.springframework.stereotype.Repository;

import com.test.bean.User;  

public interface IUserDao  
{  
    public User getUser(String name);  
}  