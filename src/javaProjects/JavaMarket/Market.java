package javaProjects.JavaMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {
    static List<String> urunler = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun", "Uzum", "Limon"));
    static List<Double> fiyatlar = new ArrayList<>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
    static List<String> sepetUrunlerin = new ArrayList<>();
    static List<Double> sepetKg = new ArrayList<>();
    static List<Double> sepetFiyatlar = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

    	/* Basarili Market alis-veris programi.
		 *
		 * 1. Adim: �r�nler ve fiyatlari iceren listeleri olusturunuz.
		 * 			No 	   urun 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Sogan      	 2.30 TL
					04	 Havuc     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 cilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 uzum      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL
					
							 * 2. Adm: Kullanicininn �r�n nosuna g�re listeden �r�n secmesini isteyiniz.
		 * 3. Adm: Ka� kg satin almak istedigini sorunuz.
		 * 4. Adm: Alinacak bu �r�n� sepete ekleyiniz ve Sepeti yazdiriniz.
		 * 5. Baska bir �r�n alip almak istemedigini sorunuz.
		 * 6. Eger devam etmek istiyorsa yeniden �r�n secme kismina y�nlendiriniz.
		 * 7. Eger bitirmek istiyorsa �demeyi kontrol edip para ustu hesaplayarak  programi bitirinzi.

		 */

        String devam = "";
        double toplamFiyat = 0;
        do {
            urunListesi();
            System.out.print("sectiginiz urun kodunu giriniz : ");
            int urunNo = scan.nextInt();
            System.out.print("kac kilo alacaksiniz : ");
            double kg = scan.nextDouble();
            sepeteEkle(urunNo, kg);
            toplamFiyat = sepetTutari();
            System.out.println("dewam edecekseniz e yaziniz  :");
            devam = scan.next();

        }
        while (devam.equalsIgnoreCase("e"));
        odeme(toplamFiyat);

    }

    private static double sepetTutari() {


        double septTutar = 0;
        double sptKg = 0;
        for (int i = 0; i < sepetUrunlerin.size(); i++) {
            septTutar += sepetFiyatlar.get(i);
            sptKg += sepetKg.get(i);
        }
        System.out.println("toplam odemeniz gereken miktar : " + septTutar + " aliginiz urun miktari :" + sptKg);
        return septTutar;
    }

    private static void odeme(double toplamFiyat) {

        System.out.println("odemeniz gereken miktar : " + toplamFiyat);
        double nakit = 0;
        do {
            System.out.print("lutfern nakit odemenizi girirniz : ");

            nakit += scan.nextDouble();
            if (nakit < toplamFiyat) {
                System.out.println("eksik odeme yaptiniz " + (toplamFiyat - nakit) + " daha odeme yapiniz");
            }
        }
        while (nakit < toplamFiyat);
        double paraUstu = nakit - toplamFiyat;
        if (paraUstu > 0) {
            System.out.println("para ustunuz : " + paraUstu);
        }

        System.out.println("yine bekleriz iii gunler");

    }

    private static void sepeteEkle(int urunNo, double kg) {
        sepetUrunlerin.add(urunler.get(urunNo));
        sepetKg.add(kg);
        sepetFiyatlar.add(fiyatlar.get(urunNo) * kg);

    }

    private static void urunListesi() {
        System.out.println(" No\t Urunler \t Fiyatlar");
        System.out.println("====\t ======== \t =======");

        for (int i = 0; i < urunler.size(); i++) {
            System.out.println(" " + i + "\t" + urunler.get(i) + "\t" + fiyatlar.get(i));

        }
    }
}
