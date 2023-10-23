package week5;

import java.util.Scanner;

public class TryCatchBlock {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir indeks girin: ");
        int index = scanner.nextInt();

        int result = getElement(arr, index);
        if (result != -1) {
            System.out.println("Dizi[" + index + "] = " + result);
        } else {
            System.out.println("Hata: Belirtilen indeks geçerli değil.");
        }
    }
    public static int getElement(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return -1;
        }
    }
}