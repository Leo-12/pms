package com.youjiuye.compare.bean;

import java.util.Date;

public class BenchMarking {

	private Integer id;
	private String companyName;
	private Double salesAmount;
	private Integer year;
	private String business;
	private String priority;
	private String disadvantage;
	private String status;
	private Integer empCount;
	private Date createTime;
	private String simpleDesc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(Double salesAmount) {
		this.salesAmount = salesAmount;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDisadvantage() {
		return disadvantage;
	}

	public void setDisadvantage(String disadvantage) {
		this.disadvantage = disadvantage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getEmpCount() {
		return empCount;
	}

	public void setEmpCount(Integer empCount) {
		this.empCount = empCount;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getSimpleDesc() {
		return simpleDesc;
	}

	public void setSimpleDesc(String simpleDesc) {
		this.simpleDesc = simpleDesc;
	}

	@Override
	public String toString() {
		return "BenchMarking{" +
				"id=" + id +
				", companyName='" + companyName + '\'' +
				", salesAmount=" + salesAmount +
				", year=" + year +
				", business='" + business + '\'' +
				", priority='" + priority + '\'' +
				", disadvantage='" + disadvantage + '\'' +
				", status='" + status + '\'' +
				", empCount=" + empCount +
				", createTime=" + createTime +
				", simpleDesc='" + simpleDesc + '\'' +
				'}';
	}
}
