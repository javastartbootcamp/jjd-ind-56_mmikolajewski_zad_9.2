package pl.javastart.task;

public class Vehicle {
    private String name;
    private double tankCapacity;
    private double averageFuelConsumption;

    public Vehicle(String name, double tankCapacity, double averageFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    double countConsumption() {
        return averageFuelConsumption;
    }

    double getRange() {
        return (tankCapacity / countConsumption()) * 100;
    }

    void printInfo() {
        System.out.print("Nazwa pojazdu: " + name + ", pojemność baku: " + tankCapacity
                + ", średnie spalnie: " + countConsumption() + "l/100km");
    }
}
