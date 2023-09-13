import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = inp.nextInt();

        int zodyakIndeks = dogumYili % 12;
        String cinZodyagiBurcu = "";

        switch (zodyakIndeks) {
            case 0:
                cinZodyagiBurcu = "Maymun";
                break;
            case 1:
                cinZodyagiBurcu = "Horoz";
                break;
            case 2:
                cinZodyagiBurcu = "Köpek";
                break;
            case 3:
                cinZodyagiBurcu = "Domuz";
                break;
            case 4:
                cinZodyagiBurcu = "Fare";
                break;
            case 5:
                cinZodyagiBurcu = "Öküz";
                break;
            case 6:
                cinZodyagiBurcu = "Tiger";
                break;
            case 7:
                cinZodyagiBurcu = "Tavşan";
                break;
            case 8:
                cinZodyagiBurcu = "Ejderha";
                break;
            case 9:
                cinZodyagiBurcu = "Yılan";
                break;
            case 10:
                cinZodyagiBurcu = "At";
                break;
            case 11:
                cinZodyagiBurcu = "Koyun";
                break;
            default:
                cinZodyagiBurcu = "Geçersiz Bir Yıl Girdiniz!";
        }

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagiBurcu);
    }
}