
public class Application {
	public static void main(String[] args) {
		
		Employee e1 = new SalariedEmployee("Karan", "233", 5000);
		Employee e2 = new CommissionEmployee("Kunal", "411", 7100, 30);
		Employee e3 = new HourlyEmployee("Akash", "411", 400, 35);
		
		Invoice i1 = new Invoice("Webcam", "Hp 720 pixel with high resolution", 2, 1500);
		System.out.println("Name:" + e1.getName() + "\tID:" + e1.getEmployee_ID() + "\t\tSalary:" + e1.getPayment());
		System.out.println("Name:" + e2.getName() + "\tID:" + e2.getEmployee_ID() + "\t\tSalary:" + e2.getPayment());
		System.out.println("Name:" + e3.getName() + "\tID:" + e3.getEmployee_ID() + "\t\tSalary:" + e3.getPayment());
		System.out.println("Total payment: " + i1.getPayment());
	}
}
