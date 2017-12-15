package com.cmc.dashboard.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.dashboard.dto.LoginParameterObject;
import com.cmc.dashboard.service.UserService;
import com.cmc.dashboard.util.MethodUtil;
import com.cmc.dashboard.util.ResultUtil;

@RestController
public class QmsUserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	private ResponseEntity<ResultUtil> login(@RequestBody String loginParams) {

		LoginParameterObject lpObj = MethodUtil.getLoginParamsFromString(loginParams);
		return new ResponseEntity<ResultUtil>(userService.loginUser(lpObj), HttpStatus.OK);
	}

}