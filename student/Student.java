package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
	System.out.println("Poonguzhali KE");
	}
	public void studentDept() {
	System.out.println("Tech");
	}
	public void studentId() {
    System.out.println("17AG033");
	}
	
  public static void main(String[] args) {
	 	// TODO Auto-generated method stub

	Student name = new Student();
    name.collegeName();
	name.collegeCode();
	name.collegeRank();
	name.depName();
    name.studentName();
    name.studentDept();
    name.studentId();
  
  }

}
