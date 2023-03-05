package Model;

public class Octal {
	String sayi;
	int yeni_taban;

	public Octal(String sayi, int yeni_taban) throws Exception {
		if (kontrol_et(sayi)) {
			this.sayi = sayi;
			this.yeni_taban = yeni_taban;
		} else {
			throw new Exception("Sekizli Sayi Değil");
		}
	}

	public String hesapla() {
		if (yeni_taban == 2) {
			return octaltobinary(Integer.parseInt(sayi));
		} else if (yeni_taban == 10) {
			return octaltoDecimal(Integer.parseInt(sayi));
		} else if (yeni_taban == 16) {
			return octaltoHeks(Integer.parseInt(sayi));
		} else {
			return sayi;
		}
	}

	public boolean kontrol_et(String sayi) {
		char[] rakam = new char[sayi.length()];
		for (int i = 0; i < sayi.length(); i++) {
			rakam[i] = sayi.charAt(i);
		}

		boolean flag = false;
		for (int i = 0; i < rakam.length; i++) {
			if (rakam[i] == '0' || rakam[i] == '1' || rakam[i] == '2' || rakam[i] == '3' || rakam[i] == '4'
					|| rakam[i] == '5' || rakam[i] == '6' || rakam[i] == '7') {
				flag = true;
			} else {
				flag = false;
				break;
			}

		}
		return flag;
	}

	public String octaltobinary(int sayi) {
		int snc = Integer.parseInt(octaltoDecimal(sayi));
		Decimal decimal = new Decimal();
		return decimal.decimaltobinary(snc);
	}

	public String octaltoDecimal(int sayi) {
		int on = 0, i = 0, bas;
		while (sayi != 0) {
			bas = sayi % 10;
			sayi /= 10;
			on += bas * Math.pow(8, i);
			++i;
		}
		return "" + on;
	}

	public String octaltoHeks(int sayi) {
		int snc = Integer.parseInt(octaltoDecimal(sayi));
		Decimal decimal = new Decimal();
		return decimal.decimaltoheks(snc);
	}

}
