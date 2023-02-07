package s3patterns1n2;

public class UruguayAddress implements Address {
	
	private final static String state = "Uruguay";
	private String street;
	private String number;
	private String floor;
	private String door;
	private String zipcode;
	private String city;
	

	public UruguayAddress(String street, String number, String floor, String door, String zipcode, String city) {
		this.street = street;
		this.number = number;
		this.floor = floor;
		this.door = door;
		this.zipcode = zipcode;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public String getNumber() {
		return number;
	}

	public String getFloor() {
		return floor;
	}

	public String getDoor() {
		return door;
	}

	public String getZipcode() {
		return zipcode;
	}

	public String getCity() {
		return city;
	}

	public static String getState() {
		return state;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "UruguayAddress [street=" + street + ", number=" + number + ", floor=" + floor + ", door=" + door
				+ ", zipcode=" + zipcode + ", city=" + city + ", state=" + state + "]";
	}

	@Override
	public String createState() {
		return null;
	}

}
