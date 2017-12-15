/**
 * 
 */
package com.cmc.dashboard.dto;

import java.util.Date;

/**
 * @author nahung
 *
 */
public class ProjectDTO {
	private Integer projectId;
	private Date fromDate;
	private Date startDate;
	private Float manDay;
	
	public ProjectDTO() {
		super();
	}
	
	public ProjectDTO(Integer projectId, Date fromDate, Date startDate, Float manDay) {
		super();
		this.projectId = projectId;
		this.fromDate = fromDate;
		this.startDate = startDate;
		this.manDay = manDay;
	}
	
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Float getManDay() {
		return manDay;
	}
	public void setManDay(Float manDay) {
		this.manDay = manDay;
	}
	

}
