package in.sp.beans;

public class Address { // main class
	private int houseno; // private properties
	private String city;
	private int pincode;

	public Address(int houseno, String city, int pincode) {
		this.houseno = houseno;
		this.city = city;
		this.pincode = pincode;// constructor
	}

	@Override
	public String toString() {
		return "#" + houseno + ", " + city + " - " + pincode;
	}
}
