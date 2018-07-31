package cbt;

public class EmployeeAction {
public static void main(String[] args) {
	
	Employee E1 = new Employee();
	E1.setName("Adam");
	E1.setEmployeeId(100L);
	E1.setSalary(100000d);
	
	Employee E2 = new Employee();
	E2.setName("John");
	E2.setEmployeeId(100L);
	E2.setSalary(120000d);
	
	System.out.println(E1.toString());
	System.out.println(E1.toString());
}
}

