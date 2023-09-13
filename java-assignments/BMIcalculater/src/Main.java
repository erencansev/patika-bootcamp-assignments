import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vücut Kitle İndeksi (BMI) Hesaplama Programı");
        System.out.print("Kilonuzu (kg) giriniz: ");
        double kilo = scanner.nextDouble();

        System.out.print("Boyunuzu (metre cinsinden) yalnızca sayı kullanarak giriniz: ");
        double boy = scanner.nextDouble();

        double bmi = kilo / (boy * boy);

        System.out.println("BMI Değeriniz: " + bmi);

    }
}
