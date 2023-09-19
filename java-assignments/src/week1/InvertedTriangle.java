package week1;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int n = input.nextInt();

        for(int l = n; l >=1; l--){

            for (int m = (n - l); m >= 1; m--){
                System.out.print(" ");
            }

            for(int p = (2*l) - 1 ; p>= 1; p--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}