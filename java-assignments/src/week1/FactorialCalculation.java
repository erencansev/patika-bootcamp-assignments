package week1;

import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n'i giriniz: ");
        int n = input.nextInt();

        System.out.print("r'i giriniz: ");
        int r = input.nextInt();

        // Kombinasyonu hesaplamak için faktoriyel fonksiyonlarını kullanarak işlem yapalım
        long kombinasyon = calculateCombination(n, r);

        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }

    // Faktoriyel hesaplama metodu
    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Kombinasyon hesaplama metodu
    public static long calculateCombination(int n, int r) {
        long kombinasyon = calculateFactorial(n) / (calculateFactorial(r) * calculateFactorial(n - r));
        return kombinasyon;
    }
}