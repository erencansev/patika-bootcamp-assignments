import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int fizik , kimya , biyoloji , mat;

        Scanner input = new Scanner(System.in);

        System.out.println("matematik notunuz :");
        mat = input.nextInt();

        System.out.println("fizik notunuz :");
        fizik = input.nextInt();

        System.out.println("kimya notunuz :");
        kimya = input.nextInt();

        System.out.println("biyoloji notunuz :");
        biyoloji = input.nextInt();

        double avarage = (mat + fizik + kimya + biyoloji);

        if (avarage <= 55) {
            System.out.println("sınıfta kaldınız seneye tekrar deneyiniz! ");
            System.out.println("ortalamanız : " + avarage);

        } else {
            System.out.println("sınıfı geçtiniz");
        }
    }
}