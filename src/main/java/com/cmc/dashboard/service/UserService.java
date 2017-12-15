package com.cmc.dashboard.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cmc.dashboard.dto.LoginParameterObject;
import com.cmc.dashboard.model.User;
import com.cmc.dashboard.util.ResultUtil;

public interface UserService {
	
	ResultUtil<User> loginUser(LoginParameterObject obj);
	
	List<User> getAllUser();
	
	LoginParameterObject getUserById(Integer id);
	
}
