package pl.javastart.task;

public class Truck extends Car {
    private int weight;

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
            consumption += 1.6;
        }
        consumption += countConsumptionForWeight();
        return consumption;
    }

    private double countConsumptionForWeight() {
        int howManyHundreds = weight / 100;
        return howManyHundreds * 0.5;
    }

    @Override
    public void turnAirConditionerOn() {
        super.turnAirConditionerOn();
    }

    @Override
    public void turnAirConditionerOff() {
        super.turnAirConditionerOff();
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("obciązenie: " + weight + "kg");
    }
}
