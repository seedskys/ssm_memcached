package com.test.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.test.bean.User;

@Repository("userDao")
public class DaoSupport implements IUserDao {
	
	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	
	
	@Override
	public User getUser(String name) {
		User user=sqlSession.selectOne("IUserDao.getUser",name);
		return user;
	}

}
