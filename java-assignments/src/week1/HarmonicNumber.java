package week1;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı değeri giriniz: ");
        double n = input.nextDouble();
        double h = 0;
        for(double i = n; i > 0; i--) {
            h += 1/i;
        }
        System.out.println("Girdiğiniz Sayının Harmonik Ortalaması : " + h);

    }

}
