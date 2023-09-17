import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,  fib1 = 0, fib2 = 1, fib3;
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        n = input.nextInt();

        System.out.print(n+" Elemanlı Fibonacci Serisi: "+fib1 + " " + fib2 + " ");

        for (int i = 1; i < n; i++) {
            fib3 = fib1 + fib2;
            System.out.print(fib3 + " ");
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}