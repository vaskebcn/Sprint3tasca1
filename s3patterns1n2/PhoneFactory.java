package s3patterns1n2;

import java.util.Scanner;

public class PhoneFactory implements AbstractFactory {

	Scanner sc = new Scanner(System.in);

	@Override
	public Phone createPhoneNumber(String type) {

		Phone doPhone = null;
		int number;

		if (type.equalsIgnoreCase("spain")) {
			System.out.println("enter spanish phone number: \n0034");
			number = sc.nextInt();
			doPhone = new Spainphone(number);
			return doPhone;
		} else if (type.equalsIgnoreCase("uk")) {
			System.out.println("enter UK phone number: \n0044");
			number = sc.nextInt();
			doPhone = new UKPhone(number);
			return doPhone;
		} else if (type.equalsIgnoreCase("uruguay")) {
			System.out.println("enter uruguaian phone number: \n00598");
			number = sc.nextInt();
			doPhone = new UruguayPhone(number);
			return new UruguayPhone(number);
		}
		return null;
	}

	@Override
	public Address createAddress(String type) {
		return null;
	}
}
