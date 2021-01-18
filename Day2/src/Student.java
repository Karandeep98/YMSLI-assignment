public class Student {
	private String name;
	private String id;
	private double grade;

	public void display() {
		System.out.println(new StringBuilder("Name: ").append(name)
				.append("\nID: ").append(id)
				.append("\nGrade:").append(grade));
	}
	public void display(int year) {
		System.out.println(new StringBuilder("Year: ").append(year));
		display();
	}

	public Student(String id) {
		this.id = id;
	}

	public Student(String name, String id) {
		this(id);
		this.name = name;
	}

	public Student(String name, String id, double grade) {
		this(name, id);
		this.grade = grade;
	}

}
