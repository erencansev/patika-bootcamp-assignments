import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int a,b;
       double c ;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu giriniz :");
        a = girdi.nextInt();
        System.out.print("2. kenar uzunluğunu giriniz :");
        b = girdi.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.print("Hipotenüs uzunluğu : " + c);
    }
}