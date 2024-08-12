package com.ksr;
class Employee{
	int empId;
	String empName;
	int empSalary;
	Employee(int empId,String empName,int empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	public void display() {
		System.out.println("Employee Id : "+empId);        
		System.out.println("Employee Name : "+empName);        
		System.out.println("Employee Salary : "+empSalary);

	}
}
public class ObjCreate {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"murugesh",2000);
		emp1.display();
	}

}
