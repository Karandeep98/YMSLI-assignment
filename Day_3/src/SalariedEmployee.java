
public class SalariedEmployee extends Employee {
	private double weekly_salary;

	public SalariedEmployee(String name, String employee_ID, double weekly_salary) {
		super(name, employee_ID);
		this.weekly_salary = weekly_salary;

	}

	@Override
	public double get_salary() {
		return weekly_salary;
	}

	@Override
	public void set_salary(double salary) {
		this.weekly_salary = salary;
	}

	@Override
	public double getPayment() {
		return get_salary();
	}
}
