package in.sp.beans;

public class Student { //main class
	private int rollno; //private properties
	private String name;
	private Address address;
	
	
	public void setRollno(int rollno) { //set method
		this.rollno = rollno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() { //method
		System.out.println("Rollono : " + rollno);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}
