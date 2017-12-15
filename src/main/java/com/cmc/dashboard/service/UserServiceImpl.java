package com.cmc.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cmc.dashboard.dto.LoginParameterObject;
import com.cmc.dashboard.model.User;
import com.cmc.dashboard.repository.UserRepository;
import com.cmc.dashboard.util.MethodUtil;
import com.cmc.dashboard.util.ResultUtil;

import scala.annotation.meta.setter;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getAllUser() {
	//	return userRepository.findAll(new MethodUtil().Pagination(pageNumber, 5, "ASC", "userName"));
		return (List<User>) userRepository.findAll();
	}

	@Override
	public LoginParameterObject getUserById(Integer id) {
		LoginParameterObject loginObj = new LoginParameterObject();
		
		User user = userRepository.findOne(id);
		
		if (user != null) {
			loginObj.setUsername(user.getUserName());
			loginObj.setPassword(user.getHashedPassword());
		}
		
		
		
		return loginObj;
	}

	@Override
	public ResultUtil<User> loginUser(LoginParameterObject obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
