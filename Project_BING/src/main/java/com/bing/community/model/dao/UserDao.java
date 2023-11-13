package com.bing.community.model.dao;

import java.util.List;

import com.bing.community.model.dto.User;

public interface UserDao {
	
	// 모든 유저 조회
	List<User> selectAll();
	
	// 유저 하나 조회
	User selectOne(int id);
	
	// 유저 등록
	int insertUser(User user);
	
	// 유저 수정
	int updateUser(User user);
	
	// 유저 삭제
	int deleteUser(int id);
}
