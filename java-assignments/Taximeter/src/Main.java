import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tmAcilis = 10;
        double km,tutar;

        System.out.println("\nTaksimetre Açılma Ücreti 10 TL'dir");
        System.out.println("\nİndibindi ücreti 20 TL'dir");
        System.out.print("\nMesafeyi KM cinsinden yazınız:  ");

        km = scanner.nextDouble();
        tutar = tmAcilis + (2.20 * km);

        if (tutar <= 20){
            System.out.println("\nÖdeme tutarı:  20 TL");
        }else {
            System.out.println("\n Ödeme Tutarı: " +tutar+" TL");
        }

    }
}