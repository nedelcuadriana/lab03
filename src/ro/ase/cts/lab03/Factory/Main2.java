package ro.ase.cts.lab03.Factory;

public class Main2 {
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("ELECTRIC");
        Car c2 = CarFactory.createCar("CLASSIC");

        c1.showInfo();
        c2.showInfo();
    }
}
