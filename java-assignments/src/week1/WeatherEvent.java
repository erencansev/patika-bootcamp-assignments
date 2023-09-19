package week1;

import java.util.Scanner;

public class WeatherEvent {
    public static void main(String[] args) {

        int weather;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Hava Sıcaklığını giriniz :");
        weather = input.nextInt();

        if (weather > 5) {
            System.out.println("Kayak Yapabilirsiniz.");
        } else if (weather > 5 && weather >= 15) {
            System.out.println("sinemaya gidebilirsiniz.");

        }else if (weather > 15 && weather >= 25) {
            System.out.println("pikniğe gidebilirsiniz.");

        }

    }
}