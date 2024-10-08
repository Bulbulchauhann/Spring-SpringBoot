package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int rollno;
	private String name;
	@Autowired
	@Qualifier("createAddObj1"); //qualifier annotations are used when there are multiple beans but you have to use specific one.
	private Address address;
	@Autowired
	private Subject subject;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	only while using manual DI----------------------

	//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

//	public Subject getSubject() {
//		return subject;
//	}
//
//	public void setSubject(Subject subject) {
//		this.subject = subject;
//	}

	public void display() {
		System.out.println("Roll no : " + rollno);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Subject : " + subject);
	}

}
