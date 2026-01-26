package com;

public class Department {
	
	private String departmentName;
	
	private int numOfStudents;
	private Professor professor;	
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getNumOfStudents() {
		return numOfStudents;
	}
	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", numOfStudents=" + numOfStudents + ", professor="
				+ professor + "]";
	}
	public Department(String departmentName, int numOfStudents, Professor professor) {
		super();
		this.departmentName = departmentName;
		this.numOfStudents = numOfStudents;
		this.professor = professor;
	}
	
	public Department() {
		
	}
	
}
