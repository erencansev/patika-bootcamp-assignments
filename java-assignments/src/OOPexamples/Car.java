package OOPexamples;

public class Car {
    public String model;
    public String color;
    public String brand;
    public int speed;
    public int price;

    public void speedUp(int increment) {
        this.speed = this.speed + increment;
    }

    public void applyBrakes(int decrement) {
        this.speed = this.speed - decrement;
    }

    public void printStates() {
        System.out.println("brand : " + this.brand + "color : " + this.color + "model : " + this.model + "speed : " + this.speed + "price  :" + this.price
        );
    }
}
