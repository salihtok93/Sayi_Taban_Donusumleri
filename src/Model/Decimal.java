package Model;

public class Decimal {
	String sayi;
	int yeni_taban;

	public Decimal(String sayi,int yeni_taban) throws Exception {
		if(kontrol_et(sayi)) {
			this.sayi = sayi;
			this.yeni_taban = yeni_taban;
			System.out.println(sayi +"   "+ yeni_taban);
			
		}else {
			throw new Exception("Onlu Sayi Değil");
		}
	}
	public Decimal() {
		
	}

	public boolean kontrol_et(String sayi) {
		char[] rakam = new char[sayi.length()];
		for (int i = 0; i < sayi.length(); i++) {
			rakam[i] = sayi.charAt(i);
		}

		boolean flag = false;
		for (int i = 0; i < rakam.length; i++) {
			if (rakam[i] == '0' || rakam[i] == '1' || rakam[i] == '2' || rakam[i] == '3' || rakam[i] == '4'
					|| rakam[i] == '5' || rakam[i] == '6' || rakam[i] == '7' || rakam[i] == '8' || rakam[i] == '9') {
				flag = true;
			} else {
				break;
			}

		}
		return flag;
	}
	public String hesapla() {
		if(yeni_taban == 2) {
			return decimaltobinary(Integer.parseInt(sayi));
		}else if(yeni_taban == 8) {
			return decimaltooct(Integer.parseInt(sayi));
		}else if (yeni_taban == 16) {
			return decimaltoheks(Integer.parseInt(sayi));
		}else {
			return sayi;
		}
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
