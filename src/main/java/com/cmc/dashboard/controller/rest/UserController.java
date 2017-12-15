package com.cmc.dashboard.controller.rest;

import java.util.List;

import org.codehaus.groovy.runtime.dgmimpl.arrays.IntegerArrayGetAtMetaMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.dashboard.dto.LoginParameterObject;
import com.cmc.dashboard.model.User;
import com.cmc.dashboard.service.UserService;
import com.cmc.dashboard.util.MethodUtil;

//@CrossOrigin("*")
@RestController
public class UserController {
	/**
	 * TODO Description
	 */
	@Autowired
	UserService userService;

	@RequestMapping(value = "/listusers", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUser() {
		return new ResponseEntity<List<User>>(userService.getAllUser(), HttpStatus.OK);
	}

	@RequestMapping(value = "/login/{userId}", method = RequestMethod.GET)
	public ResponseEntity<LoginParameterObject> getUser(@PathVariable int userId) {
		// hard code for testing
		// LoginParameterObject loginObj = new LoginParameterObject(userId, "nahung");

		//
		LoginParameterObject loginObj = userService.getUserById(userId);

		return new ResponseEntity<LoginParameterObject>(loginObj, HttpStatus.OK);
	}

	@RequestMapping(value = "/postlogin", method = RequestMethod.POST)
	public ResponseEntity<LoginParameterObject> login(@RequestBody String loginParams) {

		LoginParameterObject lpObj = MethodUtil.getLoginParamsFromString(loginParams);

		LoginParameterObject loginObj = new LoginParameterObject(lpObj.getUsername(), lpObj.getPassword());

		return new ResponseEntity<LoginParameterObject>(loginObj, HttpStatus.OK);
	}


	@RequestMapping(value = "/postCreate", method = RequestMethod.POST)
	public ResponseEntity<LoginParameterObject> create(@RequestBody String loginParams) {

		LoginParameterObject lpObj = MethodUtil.getLoginParamsFromString(loginParams);

		LoginParameterObject loginObj = new LoginParameterObject(lpObj.getUsername(), lpObj.getPassword());

		return new ResponseEntity<LoginParameterObject>(loginObj, HttpStatus.OK);
	}

}
