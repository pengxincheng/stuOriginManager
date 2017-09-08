package com.som.dao;

import com.som.entity.User;

public interface IUserDao {
	 User find(User user);
	 void add(User user);
}
