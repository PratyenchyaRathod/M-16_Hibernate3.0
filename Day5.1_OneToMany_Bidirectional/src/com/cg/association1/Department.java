package com.cg.association1;

	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="Department")
	public class Department

	{
	  private static final long serialVersionUID=1L;
	  @Id
	  @Column(name="Id")
	  private int deptId;
	  private String deptName;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	}
	