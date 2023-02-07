package s3patterns1n2;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		//create factory types, one for phone numbers, other for addresses
		AbstractFactory factory1 = FactoryMaker.getFactory("address");
		AbstractFactory factory2 = FactoryMaker.getFactory("phone");
		
		//create products of different international distinations as a type
		Address address1 = factory1.createAddress("spain");
		Phone phone1 = factory2.createPhoneNumber("spain");
		
		Address address2 = factory1.createAddress("uk");
		Phone phone2 = factory2.createPhoneNumber("UK");
		
		Address address3 = factory1.createAddress("uruguay");
		Phone phone3 = factory2.createPhoneNumber("uruguay");
		
		
		//create instance in contact class, with address and phone as arguments
		Contact John = new Contact(address1, phone1);
		Contact Emily = new Contact(address2, phone2);
		Contact Peter = new Contact (address3, phone3);
		
		
		//add contact to directory, and then show directory
		Directory.addContact(John);
		Directory.addContact(Emily);
		Directory.addContact(Peter);
		
		ArrayList<Contact>show = Directory.showDirectory();
		
		for (Contact contact : show) {
			System.out.println(contact);
		}
	}

}
