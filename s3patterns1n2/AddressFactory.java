package s3patterns1n2;

import java.util.Scanner;

public class AddressFactory implements AbstractFactory {

	Scanner sc = new Scanner (System.in);
	
	@Override
	public Address createAddress(String type) {
		Address doAddress = null;
		String street, number, floor, door, zipcode, city;
		
		if(type.equalsIgnoreCase("spain")) {
			System.out.println("enter street:");
			street = sc.nextLine();
			System.out.println("enter number:");
			number = sc.nextLine();
			System.out.println("enter floor:");
			floor = sc.nextLine();
			System.out.println("enter door:");
			door = sc.nextLine();
			System.out.println("enter zipcode:");
			zipcode = sc.nextLine();
			System.out.println("enter state:");
			city = sc.nextLine();
			
			
			doAddress = new SpainAddress(street, number, floor, door, zipcode, city);
			return doAddress;
			
		}else if(type.equalsIgnoreCase("uk")) {
			System.out.println("enter street:");
			street = sc.nextLine();
			System.out.println("enter number:");
			number = sc.nextLine();
			System.out.println("enter floor:");
			floor = sc.nextLine();
			System.out.println("enter door:");
			door = sc.nextLine();
			System.out.println("enter zipcode:");
			zipcode = sc.nextLine();
			System.out.println("enter city:");
			city = sc.nextLine();
			
			doAddress = new UKAddress(street, number, floor, door, zipcode, city);
			return doAddress;
			
		}else if(type.equalsIgnoreCase("uruguay")) {
			System.out.println("enter street:");
			street = sc.nextLine();
			System.out.println("enter number:");
			number = sc.nextLine();
			System.out.println("enter floor:");
			floor = sc.nextLine();
			System.out.println("enter door:");
			door = sc.nextLine();
			System.out.println("enter zipcode:");
			zipcode = sc.nextLine();
			System.out.println("enter city:");
			city = sc.nextLine();
			
			doAddress = new UruguayAddress(street, number, floor, door, zipcode, city);
			return doAddress;
		}
		return null;
	}
	
	@Override
	public Phone createPhoneNumber(String type) {
		return null;
	}


}
