package pl.javastart.task;

public class VehiclesUtils {
    static void printArrayInfo(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null) {
                vehicle.printInfo();
                System.out.printf("Zasięg pojazdu: %.2fkm\n", vehicle.getRange());
                System.out.println("_________________________________________________________________");
            }
        }
    }
}
