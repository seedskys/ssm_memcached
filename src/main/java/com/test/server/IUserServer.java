package com.test.server;

import com.test.bean.User;  

public interface IUserServer  
{  
    public User testMethod(String userName); 
    
    public void clearAllCache();
    
    public void cacheList();
}  