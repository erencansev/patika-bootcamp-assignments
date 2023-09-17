public class Main {
    public static void main(String[] args) {
        double sayi1 = 15.0;
        double sayi2 = 5.0;


        double sonuc1 = sayi1 + sayi2 * 2;
        double sonuc2 = (sayi1 + sayi2) * 2;

        System.out.println("İşlem önceliği göz önüne alınarak sonuç 1: " + sonuc1);
        System.out.println("Parantez kullanılarak sonuç 2: " + sonuc2);
    }
}