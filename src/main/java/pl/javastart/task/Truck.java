package pl.javastart.task;

public class Truck extends Car {
    private int weight;

    private static final double EXTRA_FUEL_CONSUMPTION_TOWARD_AIR_CONDITIONING = 1.6;
    private static final double EXTRA_FUEL_CONSUMPTION_TOWARD_OVERWEIGHT = 0.5;

    public Truck(String name, double tankCapacity, double averageFuelConsumption, boolean isAirConditioningSystemOn, int weight) {
        super(name, tankCapacity, averageFuelConsumption, isAirConditioningSystemOn);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    double countConsumption() {
        double consumption = getAverageFuelConsumption();
        if (isAirConditioningSystemStatus()) {
            consumption += EXTRA_FUEL_CONSUMPTION_TOWARD_AIR_CONDITIONING;
        }
        consumption += countConsumptionForWeight();
        return consumption;
    }

    private double countConsumptionForWeight() {
        int howManyHundreds = weight / 100;
        return howManyHundreds * EXTRA_FUEL_CONSUMPTION_TOWARD_OVERWEIGHT;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("obciązenie: " + weight + "kg");
    }
}
