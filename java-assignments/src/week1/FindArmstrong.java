package week1;

import java.util.Scanner;

public class FindArmstrong {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        int basamakSayisi = 0;
        int geciciSayi = sayi;
        int basamakDegeri;
        int sonuc = 0;
        int basamakUssu;

        while(geciciSayi != 0) {
            geciciSayi /= 10;
            basamakSayisi++;
        }
        geciciSayi = sayi;
        while(geciciSayi != 0) {
            basamakDegeri = geciciSayi % 10;
            basamakUssu = 1;
            for(int i = 1; i <= basamakSayisi; i++) {
                basamakUssu *= basamakDegeri;
            }
            sonuc += basamakUssu;
            geciciSayi /= 10;
        }
        System.out.println(sayi + " sayısının basamak üssü toplam değeri: " + sonuc);
        if(sonuc==sayi) {
            System.out.println(sayi + " sayısı bir armstrong sayıdır.");
        }
        else {
            System.out.println(sayi + " sayısı bir armstrong sayı değildir.");
        }
    }

}