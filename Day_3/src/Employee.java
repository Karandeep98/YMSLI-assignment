import java.util.ArrayList;

public class Employee {
	private String name;
	private String employee_ID;
	
	public Employee(String name, String employee_ID) {
		this.name = name;
		this.employee_ID = employee_ID;
	}


	public static void main(String[] args) {
		Employee e1 = new SalariedEmployee("Karan", "233", 5000);
		Employee e2 = new CommissionEmployee("Kunal", "411", 71,30);
		Employee e3 = new HourlyEmployee("Akash", "411", 400,35);
		
		ArrayList<Employee> list =new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		for(Employee e: list) {
			System.out.println();
		}
		}
}
