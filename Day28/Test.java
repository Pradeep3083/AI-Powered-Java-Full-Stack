package com;

public class Test {
	public static void main(String[] args) {
		
		Professor professor = new Professor();
		professor.setExp(10);
		professor.setName("Pradeep");
		
		Department department = new Department();
		department.setDepartmentName("ECE");
		department.setNumOfStudents(100);
		department.setProfessor(professor);
		
		System.out.println(department);
		
		Professor professor2 = new Professor("XYZ",15);
		Department department2 = new Department("Mech", 60, professor2);
		System.out.println(department2);
		
		Department department3 = new Department("CSE",70, new Professor("YYY",10));
		Professor professor3 = department3.getProfessor();
		System.out.println(professor3);
		System.out.println(department.getProfessor().getName());
		
	}
}
