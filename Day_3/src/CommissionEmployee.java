
public class CommissionEmployee extends Employee {
	private int weekly_sales;
	private double commission_percent;

	public CommissionEmployee(String name, String employee_ID, int weekly_sales, double commission_percent) {
		super(name, employee_ID);
		this.weekly_sales = weekly_sales;
		this.commission_percent = commission_percent;
	}

	public double get_salary() {
		return (weekly_sales * commission_percent / 100);
	}

	public int getWeekly_sales() {
		return weekly_sales;
	}

	public void setWeekly_sales(int weekly_sales) {
		this.weekly_sales = weekly_sales;
	}

	public double getCommission_percent() {
		return commission_percent;
	}

	public void setCommission_percent(double commission_percent) {
		this.commission_percent = commission_percent;
	}
}
