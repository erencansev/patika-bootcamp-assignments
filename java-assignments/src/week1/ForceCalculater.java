package week1;

import java.util.Scanner;

public class ForceCalculater {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        int k = inp.nextInt();

        for (int i = 1; i <= k; i *= 4)
            System.out.print(i + " ");
        System.out.println();
        for (int j = 1; j <= k; j *= 5)
            System.out.print(j + " ");


    }
}