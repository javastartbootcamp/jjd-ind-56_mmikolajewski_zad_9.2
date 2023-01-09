package pl.javastart.task;

public class Car extends Vehicle {
    private boolean airConditioningSystemStatus;
    private static final double EXTRA_FUEL_CONSUMPTION_TOWARD_AIR_CONDITIONING = 0.8;

    public Car(String name, double tankCapacity, double averageFuelConsumption, boolean airConditioningSystemStatus) {
        super(name, tankCapacity, averageFuelConsumption);
        this.airConditioningSystemStatus = airConditioningSystemStatus;
    }

    private String getAirConditioningSystemStatus() {
        if (airConditioningSystemStatus) {
            return "ON";
        } else {
            return "OFF";
        }
    }

    public boolean isAirConditioningSystemStatus() {
        return airConditioningSystemStatus;
    }

    public void turnAirConditionerOn() {
        if (!airConditioningSystemStatus) {
            this.airConditioningSystemStatus = true;
        }
    }

    public void turnAirConditionerOff() {
        if (!airConditioningSystemStatus) {
            this.airConditioningSystemStatus = true;
        }
    }

    @Override
    double countConsumption() {
        if (airConditioningSystemStatus) {
            return getAverageFuelConsumption() + EXTRA_FUEL_CONSUMPTION_TOWARD_AIR_CONDITIONING;
        } else {
            return getAverageFuelConsumption();
        }
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(", klimatyzacja: " + getAirConditioningSystemStatus());
    }
}

