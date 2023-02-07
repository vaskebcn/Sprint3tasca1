package s3patterns1n2;

public interface AbstractFactory {
	
	Address createAddress(String type);
	Phone createPhoneNumber(String type);

}
