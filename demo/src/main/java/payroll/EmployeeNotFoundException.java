package payroll;

class EmployeeNotFoundException extends RuntimeException {
	
	EmployeeNotFoundException(long id){
		super("could not find employee" + id);
	}
}
