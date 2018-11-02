package com.test.demo1.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int id;
	String name;
	
	@Autowired
	Department deptId;
	
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
	public Department getDeptId() {
		return deptId;
	}
	public void setDeptId(Department deptId) {
		this.deptId = deptId;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptId=" + deptId + "]";
	}
	
	
	

}
