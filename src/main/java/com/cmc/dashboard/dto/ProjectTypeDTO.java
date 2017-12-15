/**
 * 
 */
package com.cmc.dashboard.dto;

import java.util.Date;

/**
 * @author nahung
 *
 */
public class ProjectTypeDTO {
	private String projectName;
	private String pic;
	private String projectType;
	private Date startDate;
	private Date endDate;
	private Integer totalEffort;
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getTotalEffort() {
		return totalEffort;
	}
	public void setTotalEffort(Integer totalEffort) {
		this.totalEffort = totalEffort;
	}
	
}
