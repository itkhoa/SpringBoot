/**
 * 
 */
package com.cmc.dashboard.service;

import java.util.List;

import com.cmc.dashboard.dto.ProjectTypeDTO;
import com.cmc.dashboard.dto.UserUtilizationDTO;

/**
 * @author nahung
 *
 */
public interface ReportService {
	public List<ProjectTypeDTO> getAllProject();
	
	public List<UserUtilizationDTO> getAllUserUtilazation();
}