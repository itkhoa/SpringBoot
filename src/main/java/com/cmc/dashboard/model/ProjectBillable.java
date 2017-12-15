package com.cmc.dashboard.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


/**
 * The persistent class for the project_billable database table.
 * 
 */
@Entity
@Table(name="project_billable")
@NamedQuery(name="ProjectBillable.findAll", query="SELECT p FROM ProjectBillable p")
//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class ProjectBillable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="project_billable_id")
	private int projectBillableId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="billable_month")
	private Date billableMonth;

	@Column(name="billable_value")
	private float billableValue;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on")
	private Date createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_date")
	private Date endDate;

	@Column(name="project_id")
	private int projectId;

	@Column(name="project_name")
	private String projectName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_date")
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_on")
	private Date updatedOn;

	public ProjectBillable() {
	}

	public int getProjectBillableId() {
		return this.projectBillableId;
	}

	public void setProjectBillableId(int projectBillableId) {
		this.projectBillableId = projectBillableId;
	}

	public Date getBillableMonth() {
		return this.billableMonth;
	}

	public void setBillableMonth(Date billableMonth) {
		this.billableMonth = billableMonth;
	}

	public float getBillableValue() {
		return this.billableValue;
	}

	public void setBillableValue(float billableValue) {
		this.billableValue = billableValue;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

}