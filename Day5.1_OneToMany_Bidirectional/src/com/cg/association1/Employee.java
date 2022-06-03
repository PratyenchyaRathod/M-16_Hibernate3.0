package com.cg.association1;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee11")
public class Employee implements Serializable
{
 private static final long serialVersionUID=1L;
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Departmnet_Id")
	private Department Address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getAddress() {
		return Address;
	}
	public void setAddress(Department address) {
		Address = address;
	}
}
