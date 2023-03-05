package Model;

public class Heksadecimal {
	String sayi;
	int yeni_taban;

	public Heksadecimal(String sayi, int yeni_taban) throws Exception {
		if (kontrol_et(sayi)) {
			this.sayi = sayi;
			this.yeni_taban = yeni_taban;
		} else {
			throw new Exception("On Altılı Sayi Değil");
		}
	}

	public String hesapla() {
		if (yeni_taban == 2) {
			return hekstobinary(sayi);
		} else if (yeni_taban == 10) {
			return hekstodecimal(sayi);
		} else if (yeni_taban == 8) {
			return hekstooctal(sayi);
		} else {
			return this.sayi;
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
					|| rakam[i] == '5' || rakam[i] == '6' || rakam[i] == '7' || rakam[i] == '8' || rakam[i] == '9'
					|| rakam[i] == 'a' || rakam[i] == 'b' || rakam[i] == 'c' || rakam[i] == 'd' || rakam[i] == 'e'
					|| rakam[i] == 'f') {
				flag = true;
			} else {
				flag = false;
				break;
			}

		}
		return flag;
	}

	public String hekstobinary(String sayi) {
		String snc = hekstodecimal(sayi);
		Decimal decimal = new Decimal();
		return decimal.decimaltobinary(Integer.parseInt(snc));
	}

	public String hekstodecimal(String sayi) {
		int decimal = Integer.parseInt(sayi, 16);
		return "" + decimal;
	}

	public String hekstooctal(String sayi) {
		String snc = hekstodecimal(sayi);
		Decimal decimal = new Decimal();
		return decimal.decimaltooct(Integer.parseInt(snc));
	}
}
