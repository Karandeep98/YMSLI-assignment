
public class SalariedEmployee extends Employee {
	private double weekly_salary;

	public SalariedEmployee(String name, String employee_ID, double weekly_salary) {
		super(name, employee_ID);
		this.weekly_salary = weekly_salary;

	}

	public double getWeekly_salary() {
		return weekly_salary;
	}

	public void setWeekly_salary(double weekly_salary) {
		this.weekly_salary = weekly_salary;
	}
}
