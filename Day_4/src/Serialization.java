import java.io.*;

public class Serialization {
	public static void main(String[] args) {
		Employee employee1 = new Employee("karan", "YM233", "A-16 Burari Delhi",50000);
		Employee employee2 = new Employee("akash", "YM296", "A-123 Vasant Vihar Delhi",40000);
		Employee employee3 = new Employee("aditya", "YM268", "A-4 Paschim Vihar Delhi",45000);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
					new File("C:\\Users\\ve00ym233\\Documents\\new workspace\\Day_4\\src\\object_record.ser")));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					new File("C:\\Users\\ve00ym233\\Documents\\new workspace\\Day_4\\src\\object_record.ser")));

			oos.writeObject(employee1);
			oos.writeObject(employee2);
			oos.writeObject(employee3);

			Employee employee = new Employee();
			while (true) {
				try {
					employee = (Employee) ois.readObject();
				} catch (EOFException e) {break;
				}
				System.out.println(employee);
			}
			oos.close();
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
