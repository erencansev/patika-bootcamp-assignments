import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kmBasinaUcret = 0.10, km, cocukIndirimi, cocukTutar, gencIndirimi, gencTutar, yasliIndirimi, yasliTutar;
        int yas, yolculukTipi;
        System.out.println("\nYolculuk tipi:\n(1)Tek Yön\n(2)Gidiş-Dönüş");
        System.out.println("Seçim: ");
        yolculukTipi = inp.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();

        if (!(yas < 0)) {
            System.out.print("KM cinsinden mesafeyi giriniz:");
            km = inp.nextDouble();
            double toplamUcret = kmBasinaUcret * km;
            double gidisDonusToplamUcret = toplamUcret * 2;
            if (!(km < 0)) {
                if (yolculukTipi == 1 || yolculukTipi == 2) {
                    if (yolculukTipi == 1) {
                        if (yas < 12) {
                            cocukIndirimi = toplamUcret * 0.50;
                            cocukTutar = toplamUcret - cocukIndirimi;
                            System.out.println("%50 çocuk indirimi uygulanmıştır. Toplam ücretiniz: " + cocukTutar+ " TL");
                        } else if (yas >= 12 && yas <= 24) {
                            gencIndirimi = toplamUcret * 0.10;
                            gencTutar = toplamUcret - gencIndirimi;
                            System.out.println("%10 genç indirimi uygulanmıştır. Toplam ücretiniz: " + gencTutar+ " TL");
                        } else if (yas >= 65) {
                            yasliIndirimi = toplamUcret * 0.30;
                            yasliTutar = toplamUcret - yasliIndirimi;
                            System.out.println("%30 yaşlı indirimi uygulanmıştır. Toplam ücretiniz: " + yasliTutar+ " TL");
                        } else {
                            System.out.println("Toplam ücretiniz: " + toplamUcret + " TL");
                        }
                    }

                    if (yolculukTipi == 2) {
                        double GidisDonusIndirim = 0.20;
                        if (yas < 12) {
                            cocukIndirimi = gidisDonusToplamUcret * 0.50;
                            cocukTutar = gidisDonusToplamUcret - cocukIndirimi;
                            double cocukGidisDonus = cocukTutar * GidisDonusIndirim;
                            double sonCocuk = cocukTutar - cocukGidisDonus;
                            System.out.println("%50 çocuk indirimi + %20 Gidiş Dönüş Bilet Kampanyası uygulanmıştır. Toplam ücretiniz: " + sonCocuk+ " TL");
                        } else if (yas >= 12 && yas <= 24) {
                            gencIndirimi = gidisDonusToplamUcret * 0.10;
                            gencTutar = gidisDonusToplamUcret - gencIndirimi;
                            double gencGidisDonus = gencTutar * GidisDonusIndirim;
                            double sonGenc = gencTutar - gencGidisDonus;
                            System.out.println("%10 genç indirimi + %20 Gidiş Dönüş Bilet Kampanyası uygulanmıştır. Toplam ücretiniz: " + sonGenc+ " TL");
                        } else if (yas >= 65) {
                            yasliIndirimi = toplamUcret * 0.30;
                            yasliTutar = toplamUcret - yasliIndirimi;
                            double yasliGidisDonus = yasliTutar * GidisDonusIndirim;
                            double sonYasli = yasliTutar - yasliGidisDonus;
                            System.out.println("%30 yaşlı indirimi + %20 Gidiş Dönüş Bilet Kampanyası uygulanmıştır. Toplam ücretiniz: " + sonYasli+ " TL");
                        } else {
                            System.out.println("Toplam ücretiniz: " + gidisDonusToplamUcret+ " TL");
                        }
                    }
                } else {
                    System.out.println("Gidiş-Dönüş / Tek Yön seçimini belirtirken yanlış işlem yaptınız");
                }
            } else {
                System.out.println("0'un altında KM giremezsin.");
            }

        }
    }
}