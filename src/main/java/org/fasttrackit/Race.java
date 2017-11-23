package org.fasttrackit;

public class Race {
private Track track;
private Car firstCompetitor;
private Car secondCompetitor;

public void start() {
    Engine engine = new Engine();
    engine.setManufacturer("Volvo");
    firstCompetitor= createCompetitor(engine, "Volvo", "red",40,8.5,4);
    Engine secondengine = new Engine();
    secondengine.setManufacturer("Toyota");
    secondCompetitor= createCompetitor(engine, "Toyota", "black",40,10.5,4);

}


// parameters contain car prefix just to demo they can have any name
private Car createCompetitor(Engine carEngine, String carName, String carColor,double carFuelLevel, double carMileage, int carDoorCount){
    Car competitor = new Car (carEngine);
    competitor.setName(carName);
    competitor.setColor(carColor);
    competitor.setFuelLevel(carFuelLevel);
    competitor.setDoorCount(carDoorCount);

    return competitor;
}









    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Car getFirstCompetitor() {
        return firstCompetitor;
    }

    public void setFirstCompetitor(Car firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public Car getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setSecondCompetitor(Car secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}
