package org.student;

import org.department.Department;

public class Student extends Department{
	
			public void studentName() {
				System.out.println("Student Name is : " + "Vinodhini Rajavel");
			}
			
			public void studentDept() {
				System.out.println("Student Department is " + "MCA");
			}
			
			public void studentId() {
				System.out.println("Student Id is :" + "26");
			}
			
			public static void main(String[] args){
				Student stud = new Student();
				stud.collegeName();             //College
				stud.collegeCode();
				stud.collgeRank();
				
				stud.deptName();              //Department
				
				stud.studentId();
				stud.studentName();          //Student
				stud.studentDept();
				
			}
	
}
