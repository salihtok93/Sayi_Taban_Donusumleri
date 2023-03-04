package Model;

public class Binary {
	String sayi;
	int yeni_taban;
	public Binary(String sayi,int yeni_taban) throws Exception  {
		if(kontrol_et(sayi)) {
			this.sayi = sayi;
			this.yeni_taban = yeni_taban;
			System.out.println(sayi +"   "+ yeni_taban);
			
		}else {
			throw new Exception("İkili Sayi Değil");
		}
		
	}
	public int hesapla() {
			if(yeni_taban == 10) {
				return binarytodecimal(Integer.parseInt(sayi));
			}else if(yeni_taban == 8) {
				return binarytooctal(Integer.parseInt(sayi));
			}else if(yeni_taban == 16) {
				return binarytohex(Integer.parseInt(sayi));
			}else {
				return Integer.parseInt(sayi);
			}
		
	}
	
	public boolean kontrol_et(String sayi) {
		char[] rakam= new char[sayi.length()];
		for(int i = 0 ; i < sayi.length();i++) {
			rakam[i] = sayi.charAt(i);
		}
		
		boolean flag = false;
		for(int i = 0 ; i < rakam.length ; i++) {
			if(rakam[i] == '0' || rakam[i]=='1') {
				flag = true;
			}else {
				break;
			}
			
		}
		return flag;
	}
	
	public int binarytodecimal(int sayi) {
		int onlukSayi = 0, i = 0;
        int kalan;
        while (sayi != 0)
        {
            kalan = sayi % 10;
            sayi /= 10;
            onlukSayi += kalan * Math.pow(2, i);
            ++i;
        }
		return onlukSayi;
	}
	public int binarytooctal(int sayi) {
		int snc = binarytodecimal(sayi);
		Decimal decimal = new Decimal();
		return Integer.parseInt(decimal.decimaltooct(snc));
		
		
	}
	public int binarytohex(int sayi) {
		int snc = binarytodecimal(sayi);
		Decimal decimal = new Decimal();
		return Integer.parseInt(decimal.decimaltoheks(snc));
		
		
	}
}
