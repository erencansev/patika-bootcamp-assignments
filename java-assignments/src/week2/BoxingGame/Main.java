package week2.BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter turanKaya = new Fighter("Turan Kaya" , 15 , 100, 90, 0);
        Fighter jandarma = new Fighter("Jandarma" , 10 , 95, 100, 0);
        Ring r = new Ring(turanKaya,jandarma , 90 , 100);
        r.run();
    }
}
