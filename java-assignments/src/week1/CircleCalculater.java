package week1;

import java.util.Scanner;

public class CircleCalculater {
    public static void main(String[] args) {
       int r;
       double pi = 3.14 ;

        Scanner inp = new Scanner(System.in);


        System.out.print("lütfen dairenin yarıçapını giriniz :");
        r = inp.nextInt();
        double alan = (pi * r * r ) ;
        double cevre = (2 * pi * r) ;

        System.out.println("Dairenin Alanı :" + alan);
        System.out.println("Dairenin Çevresi :" + cevre);
    }
}