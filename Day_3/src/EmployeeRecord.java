import java.util.ArrayList;

public class EmployeeRecord {
	public static void main(String[] args) {
		Employee e1 = new SalariedEmployee("Karan", "233", 5000);
		Employee e2 = new CommissionEmployee("Kunal", "411", 7100,30);
		Employee e3 = new HourlyEmployee("Akash", "411", 400,35);
		
		ArrayList<Employee> list =new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println("Initial Salary...");
		for(Employee e: list) {
			System.out.println("Name: "+e.getName()+"\tEmployee ID: "+
					e.getEmployee_ID()+" \tWeekly salary: "+ e.get_salary());
		}
		e1.set_salary(7000);
		e2.set_salary(35);
		e3.set_salary(500);
		System.out.println("Updated Salary...");
		for(Employee e: list) {
			System.out.println("Name: "+e.getName()+"\tEmployee ID: "+
					e.getEmployee_ID()+" \tWeekly salary: "+ e.get_salary());
		}
		}
}
