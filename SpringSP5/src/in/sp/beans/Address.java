package in.sp.beans;

public class Address { //main class
	private int houseno; //private properties
	private String city;
	private int pincode;
	
	
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "#"+houseno+", "+city+ " - " + pincode;
	}
}
