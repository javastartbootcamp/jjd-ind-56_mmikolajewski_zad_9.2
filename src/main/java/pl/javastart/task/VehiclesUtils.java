package pl.javastart.task;

public class VehiclesUtils {

    static double countMaximumDistance(Vehicle vehicle) {
        return (vehicle.getTankCapacity() / vehicle.countConsumption()) * 100;
    }

    static void getArrayInfo(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null) {
                vehicle.printInfo();
                System.out.printf("Max dystans: %.2fkm\n", countMaximumDistance(vehicle));
                System.out.println("_________________________________________________________________");
            }
        }
    }
}
