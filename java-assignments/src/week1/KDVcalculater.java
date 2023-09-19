package week1;

import java.util.Scanner;

public class KDVcalculater {
    public static void main(String[] args) {

       double tutar, kdvOrani = 0.18;


       Scanner input = new Scanner(System.in);
        System.out.println("ücret tutarını girin: ");

        tutar = input.nextDouble();

       double kdvTutari = tutar * kdvOrani;
       double kdvliTutar = tutar + kdvTutari ;


        System.out.println("kdv oranı :" + kdvOrani);
        System.out.println("kdv tutarı :" + kdvTutari);
        System.out.println("kdvli tutar :" + kdvliTutar);

    }
}