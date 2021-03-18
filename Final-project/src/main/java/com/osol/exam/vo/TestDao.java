package com.osol.exam.vo;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class TestDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List<User> userList() throws Exception{
		List<User> list = sqlSession.selectList("User.UserList");
		System.out.println(list.get(0));
		return list;
	}
}
