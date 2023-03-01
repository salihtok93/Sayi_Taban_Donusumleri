package Model;

public class Number {
	private int sayi, sayi_taban, yeni_taban;
	
	
	public Number(int sayi,int tbn,int yenitbn) {
		this.sayi = sayi;
		sayi_taban = tbn;
		yeni_taban = yenitbn;
	}
	public String ikiliyedonustur(int sayi) {
		int binary[] = new int[40];
		int i = 0 ;
		while(sayi > 0 ) {
			binary[i++] = sayi %2;
			sayi /= 2;
			
		}
		String z = "";
		for(int a = i -1 ; a>= 0 ; a--) {
			z = z + binary[a];
			
		}
		return z;
	}
	public int  genel_donusum(int sayi) {
		int sonuc = 0, i = 0, basamak;
		while (sayi > 0) {
			basamak = (int) ((sayi % yeni_taban) * Math.pow(sayi_taban, i));
			i++;
			sayi = sayi / yeni_taban;
			sonuc += basamak;
		}
		return sonuc;
	}
	
}
