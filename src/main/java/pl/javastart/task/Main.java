package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota RAV4", 60, 7, false);
        Car car2 = new Car("Ford ranger", 80, 12, false);
        Car truck1 = new Truck("Mercedes Benz XX", 125, 20, false, 0);
        Car truck2 = new Truck("Mercedes Benz XX", 125, 20, false, 650);

        Car[] cars = new Car[5];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = truck1;
        cars[3] = truck2;

        VehiclesUtils.printArrayInfo(cars);

        car1.turnAirConditionerOn();
        car2.turnAirConditionerOn();
        truck1.turnAirConditionerOn();
        truck2.turnAirConditionerOn();

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        VehiclesUtils.printArrayInfo(cars);

    }
}
