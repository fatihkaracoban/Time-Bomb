
import java.util.Scanner;


public class SaatliBomba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int input;
		
		Zaman Kronometre = new Zaman(0,0,0);
		
		SaatliBomba.BaslikYazdir();
		
		System.out.println("Yeni saati giriniz: ");
		input = keyboard.nextInt();
		Kronometre.setSaat(input);

		System.out.println("Yeni dakikayı giriniz: ");
		input = keyboard.nextInt();
		Kronometre.setDakika(input);
		
		System.out.println("Yeni saniyeyi giriniz: ");
		input = keyboard.nextInt();
		Kronometre.setSaniye(input);
		
		System.out.print("\nGüncel Zaman: ");
		Kronometre.zamanYazdir(Kronometre);
		System.out.print("\n");
		
		System.out.println("Bomba kaç saniye sonra patlasın?: ");
		int zamanlayici = keyboard.nextInt();
		
		while(zamanlayici > 0) {
			Kronometre.ileriSayim(Kronometre);
			
			Kronometre.zamanYazdir(Kronometre);
			
            try { 
                // thread to sleep for 1000 milliseconds 
                Thread.sleep(1000); 
            } 
  
            catch (Exception e) { 
                System.out.println(e); 
            }
            
            Zaman.imleciBasaAl();
            
			zamanlayici--;
		}
		
		Kronometre.zamanYazdir(Kronometre);
		System.out.println("\n\nBum!!!");
	}
	
	public static void BaslikYazdir() {
		System.out.println("************************");
		System.out.println("***** SAATLİ BOMBA *****");
		System.out.println("************************\n");
	}

}
