import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = input.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = input.nextDouble();

        double tamSayiOndalikli = (double) tamSayi;
        int ondalikliSayiTam = (int) ondalikliSayi;
        
        System.out.println("Tam Sayıdan Ondalıklı Sayıya Dönüşüm: " + tamSayiOndalikli);
        System.out.println("Ondalıklı Sayıdan Tam Sayıya Dönüşüm: " + ondalikliSayiTam);
    }
}
