package Week2Day3;

public class EmployeeDetails {

	public void getEmployeeName (String empName) {
		System.out.println("employee Name: = "+ empName);
	}
	
	public void getEmployeeId (int empId) {
		System.out.println("employee Id: = "+ empId);
	}
	
	public void getEmployeeAddress (String empAddress) {
		System.out.println("employee Address: = "+ empAddress);
	}
	
	public void getEmployeeSalary (double empSalary) {
		System.out.println("employee : = "+ empSalary);
	}
	public void getEmployeeMobileNumber (Long empMobileNumber) {
		System.out.println("employee MobileNumber: = "+ empMobileNumber);
	}
	
	
	
	public static void main(String[] args) {
		EmployeeDetails company = new EmployeeDetails();
	    company.getEmployeeName("Poonguzhali");
		company.getEmployeeId(033);
		company.getEmployeeAddress("Ulundurpet");
		company.getEmployeeSalary(15000.00);
		company.getEmployeeMobileNumber(9876543210L);

	}

}
