/**
 * 
 */
package com.cmc.dashboard.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.dashboard.dto.ProjectTypeDTO;
import com.cmc.dashboard.dto.UserUtilizationDTO;
import com.cmc.dashboard.model.User;
import com.cmc.dashboard.service.ReportService;

/**
 * @author nahung
 *
 */
@RestController
public class ReportController { 
	
	@Autowired
	ReportService reportService;
	
	@RequestMapping(value = "/getProjectlist", method = RequestMethod.GET)
	public ResponseEntity<List<ProjectTypeDTO>> getProjectlist() {
		return new ResponseEntity<List<ProjectTypeDTO>>(reportService.getAllProject(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getUserUtilization", method = RequestMethod.GET)
	public ResponseEntity<List<UserUtilizationDTO>> getUserUtilization() {
		return new ResponseEntity<List<UserUtilizationDTO>>(reportService.getAllUserUtilazation(), HttpStatus.OK);
	}
	
	
}
