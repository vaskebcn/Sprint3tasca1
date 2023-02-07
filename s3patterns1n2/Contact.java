package s3patterns1n2;

public class Contact {
	
	private Address address;
	private Phone phone;
	
	public Contact(Address address, Phone phone) {
		this.address = address;
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [address=" + address + ", phone=" + phone + "]";
	}
	
	

}
