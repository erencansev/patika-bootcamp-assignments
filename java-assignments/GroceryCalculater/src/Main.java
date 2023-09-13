import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double armutKiloFiyati = 2.14;
        double elmaKiloFiyati = 3.67;
        double domatesKiloFiyati = 1.11;
        double muzKiloFiyati = 0.95;
        double patlicanKiloFiyati = 5.00;
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;

        System.out.print("Kaç Kilo Armut Aldığınızı Belirtiniz : ");
        armutKilo = scanner.nextDouble();

        System.out.print("Kaç Kilo Elma Aldığınızı Belirtiniz : ");
        elmaKilo = scanner.nextDouble();

        System.out.print("Kaç Kilo Domates Aldığınızı Belirtiniz: ");
        domatesKilo = scanner.nextDouble();

        System.out.print("Kaç Kilo Muz Aldığınızı Belirtiniz: ");
        muzKilo = scanner.nextDouble();

        System.out.print("Kaç Kilo Patlıcan Aldığınızı Belirtiniz: ");
        patlicanKilo = scanner.nextDouble();

        double toplamTutar = (armutKilo * armutKiloFiyati) +
                (elmaKilo * elmaKiloFiyati) +
                (domatesKilo * domatesKiloFiyati) +
                (muzKilo * muzKiloFiyati) +
                (patlicanKilo * patlicanKiloFiyati);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}