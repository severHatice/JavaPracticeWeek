package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class QMarket {
    /*
     * bir bakkalin 7 gunluk tum kazanclarini gunluk olarak gosteren bir program yaziniz
     * ayrica bakkalin bu hafta ortalama kazandigi miktari gosteren bir kod yaziniz
     * ayrica bakkalin hangi gunler ortalamanin ustunde kazandigini gosteren bir metod yaziniz
     *  ayrica bakkalin hangi gunler ortalamanin altinda kazandigini gosteren bir metod yaziniz
     *  
     *
     * 1. Adim : gunleri isaret eden bir tane arrayslist olusturun(gunler)G
     * 2. Adm : gunluk kazanclarimizi ekleyecegimiz bir tane ArrayList olusturun. (gunlukKazanclar)
     * 3. Adm : While dongusu ile kullanicidan 7 gunluk kazanclari  tekek teker alip gunlukKazanclar ArrayList'e ekle.
     * 4. Adm : getOrtalamaKazanc() adli method ile ortalama kazanci alin.
     * 5. Adm : getOrtalamaninUstundeKazancGunleri() adli method olusturun.
     * 			 for dongusu ile tam gunleri ortalama kazanc ile karsilastir
     * 			 ortalama kazanctan yuksekse o gunleri return yap.
     * 6. Adim : getOrtalamaninAltindaKazancGunleri() adli method olusturun.
     * 			 for dongusu ile tam gunleri ortalama kazanc ile karsilastir
     * 			 ortalama kazanctan asagiyysa o gunleri return yap.
     * */


    static List<String> gunler = new ArrayList<>(Arrays.asList(" Pazartesi", " Sali", " Carsamba", " Persembe", " Cuma", " Cumartesi", " Pazar"));//1. adım
    static List<Double> gunlukKazanclar = new ArrayList<>();//2. adım
    static double ciro = 0;

    public static void main(String[] args) {

        int gun = 0;
        Scanner sc = new Scanner(System.in);
        while (gun < 7) {//3. adım
            System.out.print(gunler.get(gun) + " gunluk kazancinizi giriniz : ");//gunler listinden aldigimiz gun ile kullanacagimiz gunun hasilatini istedim.
            double gunlukhasilat = sc.nextDouble();//istedigim hasilati gunluk hasilata atadim
            gunlukKazanclar.add(gunlukhasilat);//aldigim gunluk hasilati gunlukKazanclar listine ekledim.
            ciro += gunlukhasilat;//aldigim gunluk hasilati kasaya ekledim.
            gun++;//0 1 2 3 4 5 6 .gunleri m.
        }
        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGunleri();
        getOrtalamaninAltindaKazancGunleri();

        System.out.println("günlükkazanclar : " + gunlukKazanclar);
        System.out.println("ciro  : " + ciro);
        System.out.println("ortalama kazanç : " + getOrtalamaKazanc());
        System.out.println("ortalamanın üstündeki gün : " + getOrtalamaninUstundeKazancGunleri());
        System.out.println("ortalamanın altındaki gün : " + getOrtalamaninAltindaKazancGunleri());
    }

    private static String getOrtalamaninAltindaKazancGunleri() {//6. adım
        String ortAltGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {
                ortAltGun += gunler.get(i);
            }
        }
        return ortAltGun;
    }

    private static String getOrtalamaninUstundeKazancGunleri() {//5.adım
        String ortUstGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {
                ortUstGun += gunler.get(i);
            }
        }
        return ortUstGun;
    }

    private static double getOrtalamaKazanc() {//4. adım
        double ortalama = ciro / 7;
        return ortalama;
    }
}