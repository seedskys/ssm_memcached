package com.test.bean;

import java.io.Serializable;  

public class User implements Serializable  
{  
  
    private static final long serialVersionUID = -985141821084238350L;  
  
    private int id;  
      
    private String name;  
      
    private String gender;  
      
    public User()  
    {  
    }  
  
    public int getId()  
    {  
        return id;  
    }  
  
    public void setId(int id)  
    {  
        this.id = id;  
    }  
  
    public String getName()  
    {  
        return name;  
    }  
  
    public void setName(String name)  
    {  
        this.name = name;  
    }  
  
    public String getGender()  
    {  
        return gender;  
    }  
  
    public void setGender(String gender)  
    {  
        this.gender = gender;  
    }  
      
}  