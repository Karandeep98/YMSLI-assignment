import java.util.Scanner;

public class VehicleApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 to create a Vehicle \nPress 2 to create a Car \n"
					+ "Press 3 to create a Convertible Car\nPress 4 to create a Sports Car \nPress 0 to exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Vehicle vehicle = new Vehicle(4, 4, 111, "BMW");
				vehicle.display();
				break;
			case 2:
				Car car = new Car(4, 6, 117, "BMW", 6);
				car.display();
				break;
			case 3:
				Convertible_Car convertible_Car = new Convertible_Car(4, 6, 117, "BMW", 6, true);
				convertible_Car.display();
				break;
			case 4:
				SportsCar sportsCar = new SportsCar(4, 6, 117, "BMW", 6);
				sportsCar.display();
				break;
			case 0:
				System.exit(0);

			}
			
		}

	}
}
