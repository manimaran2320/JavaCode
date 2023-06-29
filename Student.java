package Pack1;

public class Student {
	static void Display() {
		String sname="Mani";
		int rollno=13;
		int age=22;
		int marks=80;
		int fee=40000;
		System.out.println("Student rollno: "+rollno);
		System.out.println("Student name: "+sname);
		System.out.println("Student age: "+age);
		System.out.println("Student marks: "+marks);
		System.out.println("Student fee: "+fee);
	}
	public void Show() {
		String sname="Karthi";
		int rollno=14;
		int age=20;
		int marks=90;
		int fee=30000;
		System.out.println("Student rollno: "+rollno);
		System.out.println("Student name: "+sname);
		System.out.println("Student age: "+age);
		System.out.println("Student marks: "+marks);
		System.out.println("Student fee: "+fee);

	}
	public static void main(String[] args) {
		Student.Display();
		System.out.println("************************");
		Student stud=new Student();
		stud.Show();
	}

}
