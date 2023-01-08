package pl.javastart.task;

public class Car extends Vehicle {
    private boolean airConditioningSystemStatus;

    public Car(String name, double tankCapacity, double averageFuelConsumption, boolean airConditioningSystemStatus) {
        super(name, tankCapacity, averageFuelConsumption);
        this.airConditioningSystemStatus = airConditioningSystemStatus;
    }

    public String printAirConditioningSystemStatus() {
        if (airConditioningSystemStatus) {
            return "ON";
        } else {
            return "OFF";
        }
    }

    public boolean isAirConditioningSystemStatus() {
        return airConditioningSystemStatus;
    }

    public void setAirConditioningSystemStatus(boolean airConditioningSystemStatus) {
        this.airConditioningSystemStatus = airConditioningSystemStatus;
    }

    @Override
    public void turnAirConditionerOn() {
        if (!airConditioningSystemStatus) {
            this.airConditioningSystemStatus = true;
        }
    }

    @Override
    public void turnAirConditionerOff() {
        if (!airConditioningSystemStatus) {
            this.airConditioningSystemStatus = true;
        }
    }

    @Override
    double countConsumption() {
        if (airConditioningSystemStatus) {
            return getAverageFuelConsumption() + 0.8;
        } else {
            return getAverageFuelConsumption();
        }
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(", klimatyzacja: " + printAirConditioningSystemStatus());
    }
}

