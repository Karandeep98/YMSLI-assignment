
public class Vehicle {
	private int noOfwheels;
	private int noOfPassangers;
	private int model;
	private String make;
	
	public Vehicle(int noOfwheels, int noOfPassangers, int model, String make) {
		this.noOfwheels = noOfwheels;
		this.noOfPassangers = noOfPassangers;
		this.model = model;
		this.make = make;
	}

	public void display() {
		System.out.println(new StringBuilder("Make: ").append(make)
				.append("\nModel: ").append(model).append("\nNo. of wheel: ").append(noOfwheels)
				.append("\nNo of Passenger: ").append(noOfPassangers));
	}
	
}


