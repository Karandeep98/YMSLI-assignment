
public class Car extends Vehicle {
	private int noOfDoor;

	public Car(int noOfwheels, int noOfPassangers, int model, String make, int noOfDoor) {
		super(noOfwheels, noOfPassangers, model, make);
		this.noOfDoor = noOfDoor;
	}

	public int getNoOfDoor() {
		return noOfDoor;
	}

	public void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}

	public void display() {
		super.display();
		System.out.println(new StringBuilder("No of door: ").append(noOfDoor));
	}
}
