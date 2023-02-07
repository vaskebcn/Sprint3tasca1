package s3patterns1n2;

public class FactoryMaker {
	
	public static AbstractFactory getFactory(String type) {
		
		if(type.equalsIgnoreCase("phone")) {
			return new PhoneFactory();
		}else if(type.equalsIgnoreCase("address")) {
			return new AddressFactory();
		}
		
		return null;
		
	}

}
