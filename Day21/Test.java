package com;

public class Test {

    public static void main(String[] args) {

        // Object 1
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.name = "Pradeep";
        
        System.out.println(emp1.id);
        System.out.println(emp1.name);
        System.out.println(Employee.companyName);

        // Object 2
        Employee emp2 = new Employee();
        emp2.id = 2;
        emp2.name = "Sai";
        
        System.out.println(emp2.id);
        System.out.println(emp2.name);
        System.out.println(emp2.companyName);
    }
}


/*
package com;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.id = 1;
		emp.name = "Pradeep";
		Employee.companyName = "Company 1";
		
		Employee emp2 = new Employee();
		
		System.out.println(emp.id);
		System.out.println(emp2.id);
		
		System.out.println(emp.name);
		System.out.println(emp2.name);
		
		System.out.println(emp.companyName);
		System.out.println(emp2.companyName);
		
		emp.id=2;
		System.out.println(emp.id);
		System.out.println(emp2.id);
		
		emp.companyName = "Company 2";
		
		System.out.println(emp2.companyName);
		
		
	}
}
*/
