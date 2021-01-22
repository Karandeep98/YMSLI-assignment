
public abstract class Employee implements Payable{
	private String name;
	private String employee_ID;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployee_ID() {
		return employee_ID;
	}

	public void setEmployee_ID(String employee_ID) {
		this.employee_ID = employee_ID;
	}

	public abstract double get_salary();

	public abstract void set_salary(double amount);

	public Employee(String name, String employee_ID) {
		this.name = name;
		this.employee_ID = employee_ID;
	}

}
