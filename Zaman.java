
public class Zaman {

	private int saat;
	private int dakika;
	private int saniye;
	
	public int getSaat() { return saat; }
	public int getDakika() { return dakika; }
	public int getSaniye() { return saniye; }
	
	public void setSaat(int saat) { this.saat = saat; }
	public void setDakika(int dakika) { this.dakika = dakika; }
	public void setSaniye(int saniye) { this.saniye = saniye; }

	public Zaman(int yeniSaat, int yeniDakika, int yeniSaniye) {
		saat = yeniSaat;
		dakika = yeniSaniye;
		saniye = yeniDakika;
	}
	
	public void zamanYazdir(Zaman Kronometre) {
		System.out.printf("%02d:%02d:%02d", Kronometre.saat, Kronometre.dakika, Kronometre.saniye);
	}
	
	public static void imleciBasaAl() {
		System.out.printf("\b\b\b\b\b\b\b\b");
	}
	
	public Zaman ileriSayim(Zaman Kronometre) {
		
		Kronometre.saniye = Kronometre.saniye + 1;
		
		if(Kronometre.saniye > 59) {
			Kronometre.saniye = 0;
			
			Kronometre.dakika = Kronometre.dakika + 1;
			
			if(Kronometre.dakika > 59) {
				Kronometre.dakika = 0;
						
				Kronometre.saat = Kronometre.saat + 1;
				
				if(Kronometre.saat > 23) {
					Kronometre.saat = 0;
				}
			}
		}
		
		return Kronometre;
	}

}
