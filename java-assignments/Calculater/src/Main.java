import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1,number2,select ;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz :");
        number1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz :");
        number2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme ");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        if(select == 1) {
            System.out.println("Toplam :" + (number1 + number2));
        } else if ( select == 2) {
            System.out.println("Çıkarma : " + ( number1 - number2));

        } else if ( select == 3) {
            System.out.println("Çarpma :" + (number1 * number2));

        } else if ( select == 4) {
            System.out.println( "Bölme :" + (number1 / number2 ));

        }

    }
}