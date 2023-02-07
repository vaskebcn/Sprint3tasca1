package s3patterns1n2;

public class UKPhone implements Phone {
	
	private final static String prefijo = "0044";
	private int number;

	public UKPhone(int number) {
		this.number = number;
	}

	public static String getPrefijo() {
		return prefijo;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "UKPhone [number=" + prefijo + number + "]";
	}

	@Override
	public String createPrefix() {
		// TODO Auto-generated method stub
		return null;
	}

}
