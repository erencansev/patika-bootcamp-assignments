import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k, total = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("n sayısını giriniz (n^k) : ");
        n = inp.nextInt();
        System.out.print("k sayısnı giriniz (n^k) : ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.print(total);
    }
}