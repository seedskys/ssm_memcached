package com.test.server;  
  

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danga.MemCached.MemCachedClient;
import com.test.bean.User;
import com.test.dao.DaoSupport;
import com.test.dao.IUserDao;
import com.test.utils.MemcachedUtils;  
  
@Service("server")
public class UserServerImpl implements IUserServer  
{  
	@Autowired
    private DaoSupport userDao;  
	
	
/*	   MemCachedClient memcachedClient=new MemCachedClient("memcache");  
	 public User testMethod(String userName)  
    {  
    	System.out.println(memcachedClient);
        User user;  
        // 判断缓存中数据是否存在，如果不存在则添加，存在则读取  
        if (this.memcachedClient.get("user") != null)  
        {  
            user = (User) this.memcachedClient.get("user");  
            System.out.println("本次操作是在缓存中查询数据...");  
        }  
        else  
        {  
            user = userDao.getUser(userName);  
            this.memcachedClient.add("user",user);  
            System.out.println("本次操作是在数据库中查询数据...");  
        }  
        return user;  
    }  */
	
	
	
	 MemcachedUtils memcachedUtils;
      
    public User testMethod(String userName)  
    {  
    	//System.out.println(memcachedUtils);
        User user;  
        // 判断缓存中数据是否存在，如果不存在则添加，存在则读取  
        if (this.memcachedUtils.get("user") != null)  
        {  
            user = (User) this.memcachedUtils.get("user");  
            System.out.println("本次操作是在缓存中查询数据...");  
        }  
        else  
        {  
            user = userDao.getUser(userName);  
            this.memcachedUtils.add("user",user,new Date(100));  
            System.out.println("本次操作是在数据库中查询数据...");  
        }  
        return user;  
    }  
    
    
   
      
   /* public IUserDao getUserDao()  
    {  
        return userDao;  
    }  
    // 依赖注入，根据属性名自动注入  
    @Autowired  
    public void setUserDao(IUserDao userDao)  
    {  
        this.userDao = userDao;  
    }  
      
    public MemcachedClient getMemcachedClient()  
    {  
        return memcachedClient;  
    }  
    // 依赖注入（分布式缓存，在spring中自动生成）  
    @Autowired  
    public void setMemcachedClient(MemcachedClient memcachedClient)  
    {  
        this.memcachedClient = memcachedClient;  
    }*/

	public void clearAllCache() {
		/*Iterator<Map<String, String>> iterSlabs = memcachedClient
				.getStats("items").values().iterator();
		Set<String> set = new HashSet<String>();
		while (iterSlabs.hasNext()) {
			Map<String, String> slab = iterSlabs.next();
			for (String key : slab.keySet()) {
				String index = key.split(":")[1];
				set.add(index);
			}
		}
		List<String> list = new LinkedList<String>();
		for (String v : set) {
			String commond = "cachedump ".concat(v).concat(" 0");
			Iterator<Map<String, String>> iterItems = memcachedClient
					.getStats(commond).values().iterator();
			while (iterItems.hasNext()) {
				Map<String, String> items = iterItems.next();
				list.addAll(items.keySet());
			}
		}
		for (String key : list) {
			// System.out.println("key:"+key);
			memcachedClient.delete(key);
		}
		*/
	}

	@Override
	public void cacheList() {
		//Map slabs=memcachedClient.sta
		
	}  
      
}  