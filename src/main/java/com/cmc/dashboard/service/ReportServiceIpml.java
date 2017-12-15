/**
 * 
 */
package com.cmc.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmc.dashboard.dto.ProjectTypeDTO;
import com.cmc.dashboard.dto.UserUtilizationDTO;
import com.cmc.dashboard.repository.UserRepository;

/**
 * @author nahung
 *
 */
@Service
@Transactional
public class ReportServiceIpml implements ReportService {
	
	@Autowired
	UserRepository userRepository;
	

	/* (non-Javadoc)
	 * @see com.cmc.dashboard.service.ReportService#getAllProject()
	 */
	@Override
	public List<ProjectTypeDTO> getAllProject() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public List<UserUtilizationDTO> getAllUserUtilazation() {
		// TODO Auto-generated method stub
		return userRepository.getUserUtilization();
	}

}
