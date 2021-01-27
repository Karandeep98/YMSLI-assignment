import java.io.*;

public class Employee implements Serializable{
	private String name, id, address;
	private transient double salary;

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public double getSalary() {
		return salary;
	}

	public Employee() {}

	public Employee(String name, String id, String address,double salary) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + ", salary=" + salary + "]";
	}

	

}
