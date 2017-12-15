/**
 * 
 */
package com.cmc.dashboard.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author nahung
 *
 */

public class UserUtilizationDTO {
	@Id
	private Integer user_id;
	private String full_name;
	
	private List<ProjectDTO> lstProject;
	
	
	
	
	
	
	public List<ProjectDTO> getLstProject() {
		return lstProject;
	}

	public void setLstProject(List<ProjectDTO> lstProject) {
		this.lstProject = lstProject;
	}

	
	private Date from_date;
	private Date to_date;
	private Float man_day;
	
	
	
	
	public UserUtilizationDTO(Integer user_id, String full_name, Float man_day, Date from_date, Date to_date) {
		super();
		this.user_id = user_id;
		this.full_name = full_name;
		this.man_day = man_day;
		this.from_date = from_date;
		this.to_date = to_date;
	}
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	
	@JsonFormat(timezone = "GMT+7", pattern = "yyyy-MM-dd")
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	
	@JsonFormat(timezone = "GMT+7", pattern = "yyyy-MM-dd")
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	public Float getMan_day() {
		return man_day;
	}
	public void setMan_day(Float man_day) {
		this.man_day = man_day;
	}
}
