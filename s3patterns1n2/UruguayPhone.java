package s3patterns1n2;

public class UruguayPhone implements Phone {
	
	private final static String prefijo = "00598";
	private int number;

	public UruguayPhone(int number) {
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
		return "UruguayPhone [number=" + prefijo + number + "]";
	}

	@Override
	public String createPrefix() {
		// TODO Auto-generated method stub
		return null;
	}

}
