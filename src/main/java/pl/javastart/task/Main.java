package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Vehicle car1 = new Car("Toyota RAV4", 60, 7, false);
        Vehicle car2 = new Car("Ford ranger", 80, 12, false);
        Vehicle truck1 = new Truck("Mercedes Benz XX", 125, 20, false, 0);
        Vehicle truck2 = new Truck("Mercedes Benz XX", 125, 20, false, 650);

        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = car1;
        vehicles[1] = car2;
        vehicles[2] = truck1;
        vehicles[3] = truck2;

        VehiclesUtils.getArrayInfo(vehicles);

        car1.turnAirConditionerOn();
        car2.turnAirConditionerOn();
        truck1.turnAirConditionerOn();
        truck2.turnAirConditionerOn();

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        VehiclesUtils.getArrayInfo(vehicles);

    }
}
