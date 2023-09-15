import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;

        System.out.print("a sayısını giriniz: ");
        a = inp.nextInt();
        System.out.print("b sayısını giriniz: ");
        b = inp.nextInt();
        System.out.print("c sayısını giriniz: ");
        c = inp.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else {
            if (b > a) {
                System.out.println("c > b > a");
            } else {
                System.out.println("c > a > b");
            }
        }
    }
}