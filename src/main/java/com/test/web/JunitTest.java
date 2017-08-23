package com.test.web;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Future;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.danga.MemCached.MemCachedClient;
import com.test.bean.User;
import com.test.server.IUserServer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class JunitTest {
	
	//此方法可行
	//@Resource
	//ApplicationContext context;
	
	@Resource
	IUserServer userService;

	@Test
	public void test() {
		/*ApplicationContext context = new ClassPathXmlApplicationContext(  
                "applicationContext.xml");*/  
        //IUserServer userService = (IUserServer) context.getBean("server");  
        User user = userService.testMethod("aa"); 
        System.out.println(user.getName());
	}
	
	@Test
	public void clearCache(){
		
	}
	
	
	
	/*@Test
	public void test1() throws Exception{
		MemcachedClient client=new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));
		System.out.println(client.toString());
		
		Future fo=client.set("runoob", 900, "Free Education");
		
		System.out.println("set status:"+fo.get());
		
		CASValue casValue=client.gets("runoob");
		System.out.println("CASValue token:" +casValue);
		
	}*/

}
