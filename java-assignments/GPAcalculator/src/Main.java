import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int matematik,fizik,kimya,turkce,tarih,edebiyat;
       Scanner inp = new Scanner(System.in);

       System.out.print("Matematik Notunuzu Giriniz:");
       matematik = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuzu Giriniz:");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz:");
        tarih = inp.nextInt();

        System.out.print("Edebiyat Notunuzu Giriniz:");
        edebiyat = inp.nextInt();

        int toplam = (matematik + fizik + kimya + edebiyat + tarih + turkce);
        double sonuc = toplam / 6.0;
        System.out.println("Not ortalamanız :" + sonuc);

        if (sonuc > 60) {
            System.out.println("sınıfı geçtiniz");
        } else if (sonuc < 60) {
            System.out.println("sınıfta kaldınız");
        }
        else {
            System.out.println("Notunuzu Hesaplayamadık lütfen tekrar deneyiniz");
        }
    }
}