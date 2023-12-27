package OOPexamples;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        car.brand = "Ford";
        System.out.println(car.brand);
        car2.brand = "Audi";

        car.model = "Focus";
        car2.model = "A4";

        car.price = 120000;
        car2.price = 160000;

        car.printStates();
        car2.printStates();

    }
}
