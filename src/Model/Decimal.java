package Model;

public class Decimal {
	private String kullanilan[] = {"0","1","2","3","4","5","6","7","8","9"};
	
	public Decimal() {
		
	}
	
	public String decimaltobinary(int sayi) {
		return Integer.toBinaryString(sayi);
	}
	public String decimaltoheks(int sayi) {
		return Integer.toHexString(sayi);
		
	}
	public String decimaltooct(int sayi) {
		return Integer.toOctalString(sayi);
	}

}
