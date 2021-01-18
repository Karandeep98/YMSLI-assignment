
public class Convertible_Car extends Car {
	private boolean isHoodOpen;

	public Convertible_Car(int noOfwheels, int noOfPassangers, int model, String make, int noOfDoor,
			boolean isHoodOpen) {
		super(noOfwheels, noOfPassangers, model, make, noOfDoor);
		this.isHoodOpen = isHoodOpen;
	}

	public void display() {
		super.display();
		if (isHoodOpen)
			System.out.println("Hood is open!!");
		else
			System.out.println("Hood is closed!!");
	}
}
