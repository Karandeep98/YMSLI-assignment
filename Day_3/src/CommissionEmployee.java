
public class CommissionEmployee extends Employee {
	private int weekly_sales;
	private double commission_percent;

	public CommissionEmployee(String name, String employee_ID, int weekly_sales, double commission_percent) {
		super(name, employee_ID);
		this.weekly_sales = weekly_sales;
		this.commission_percent = commission_percent;
	}

	@Override
	public void set_salary(double percent) {
		this.commission_percent = percent;
	}

	@Override
	public double get_salary() {
		return (weekly_sales * commission_percent / 100);
	}

	@Override
	public String toString() {
		return "CommissionEmployee [weekly_sales=" + weekly_sales + ", commission_percent=" + commission_percent + "]";
	}

	@Override
	public double getPayment() {
		return get_salary();
	}
}
