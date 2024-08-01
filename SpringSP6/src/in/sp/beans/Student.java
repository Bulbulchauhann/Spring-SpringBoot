package in.sp.beans;

public class Student { // main class
	private int rollno; // private properties
	private String name;
	private Address address;

	public Student(int rollno, String name, Address address) {
		this.rollno = rollno; // constructor
		this.name = name;
		this.address = address;
	}

	public void display() { // method
		System.out.println("Rollono : " + rollno);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}
