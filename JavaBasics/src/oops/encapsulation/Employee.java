package oops.encapsulation;

public class Employee {

	private String name;
	private int EmpCode;
	
	public Employee() {
		
	}
	
	public Employee(String name, int empCode) {

		this.name = name;
		this.EmpCode = empCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpCode() {
		return EmpCode;
	}

	public void setEmpCode(int empCode) {
		EmpCode = empCode;
	}
		
}
