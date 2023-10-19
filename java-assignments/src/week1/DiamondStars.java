package week1;

import java.util.Scanner;

public class DiamondStars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int n = input.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}