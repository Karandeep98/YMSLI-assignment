
public class HourlyEmployee extends Employee{
	private double hourly_rate;
	private double hours_worked_per_week;

	public HourlyEmployee(String name, String employee_ID,double hourly_rate, double hours_worked_per_week) {
		
		super(name, employee_ID);
		this.hourly_rate = hourly_rate;
		this.hours_worked_per_week = hours_worked_per_week;
	}

	@Override
	public void set_salary(double rate) {
		this.hourly_rate=rate;
	}

	@Override
	public double get_salary() {
		return (hourly_rate*hours_worked_per_week);
	}
}
