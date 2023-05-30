package org.department;

import org.college.College;

public class Department extends College {

	public void depName() {
		System.out.println("Agri");
	}
	
	public static void main(String[] args) {
	Department name = new Department();	
     name.collegeName();
	 name.collegeCode();
	 name.collegeRank();
	name.depName();
	
	
	
	}

}
