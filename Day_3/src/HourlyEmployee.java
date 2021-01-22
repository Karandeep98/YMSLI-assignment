
public class HourlyEmployee extends Employee{
	private double hourly_rate;
	private double hours_worked_per_week;

	public HourlyEmployee(String name, String employee_ID,double hourly_rate, double hours_worked_per_week) {
		
		super(name, employee_ID);
		this.hourly_rate = hourly_rate;
		this.hours_worked_per_week = hours_worked_per_week;
	}
public double get_salary() {
	return (hourly_rate*hours_worked_per_week);
}
	public double getHourly_rate() {
		return hourly_rate;
	}

	public void setHourly_rate(double hourly_rate) {
		this.hourly_rate = hourly_rate;
	}

	public double getHours_worked_per_week() {
		return hours_worked_per_week;
	}

	public void setHours_worked_per_week(double hours_worked_per_week) {
		this.hours_worked_per_week = hours_worked_per_week;
	}
}
