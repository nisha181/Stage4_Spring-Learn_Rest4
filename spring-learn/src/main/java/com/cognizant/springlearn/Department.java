package com.cognizant.springlearn;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Department {
	@NotNull
	@Min(1)
	@Max(9)
	String id;
	@NotNull
	@Size(min=1,max=30)
	String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Department(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Department() {
		super();
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
