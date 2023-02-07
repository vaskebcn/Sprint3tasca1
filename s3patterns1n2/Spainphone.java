package s3patterns1n2;

public class Spainphone implements Phone {

	private final static String prefijo = "0034";
	private int number;

	public Spainphone(int number) {
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
		return "Spainphone [number=" + prefijo + number + "]";
	}

	public String createPrefix() {
		String prefix = "+34";
		return prefix;
	}

}
