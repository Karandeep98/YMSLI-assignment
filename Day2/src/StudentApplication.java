import java.util.Scanner;

public class StudentApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student=null;
		while (true) {
			System.out.println("Enter 1 to enter student details:");
			System.out.println("Enter 2 to display student details:");
			System.out.println("Enter 0 to exit:");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter student ID:");
				String id = scanner.next();
				System.out.println("Enter student name: Press NA if data is not available");
				String name = scanner.next();
				if(name.equals("NA".toLowerCase())|| name.equals("NA")) student=new Student(id);					
				else {
					System.out.println("Enter student grade: Press -1 if data is not available");
					double grade = scanner.nextDouble();
					if(grade == -1)  student=new Student(name,id);
					else  student=new Student(name,id,grade);
				}	
				break;
			case 2:
				System.out.println("Enter current year of student: Press 0 if data is not available");
				int year=scanner.nextInt();
				if(year==0) student.display();
				else student.display(year);
				break;
			case 0: System.exit(0);
			}

		}

	}
}
