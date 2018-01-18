package org.fasttrackit;

public class Vehicle {
    private String name;
    private String color;
    private double currentSpeed;
    private double travelDistance;
    private double mileage;
    private double fuelLevel;

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    // currentSpeed += speed prescurtare!!


    public void accelerate(double speed) {
        System.out.println("Accelerate implementation from Autovehicle.");
        double finalSpeed = getCurrentSpeed() + speed;
        setCurrentSpeed(finalSpeed);

        double travelDistance = finalSpeed / 60;
        double spentFuel = travelDistance * mileage / 100;
        fuelLevel -= spentFuel;
        // fuelLlevel= fuelLevel- spentFuel;
        travelDistance += currentSpeed / 60;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
