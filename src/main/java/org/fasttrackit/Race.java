package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Race {
    private Track track;
    private List<Vehicle> competitors = new ArrayList<Vehicle>();
    private int competitorCount = 2;

    private String readVehicleName() {
        System.out.println("Please enter your vehicle's name");
        Scanner scanner = new Scanner(System.in); //in= streamul de date care intra in sistem, ce citim de la tastatura
        // scanner.nextLine();// tot ce scrie userul de la tastatura pana la apasarea tastei enter va fi citit pin aceasta metoda
        String name = scanner.nextLine();//stocam variabila
        System.out.println("Your vehicle's name is: " + name);

        return name;

    }

    private double readAccelerationSpeed() throws Exception {
        System.out.println("Please enter acceleration speed as a decimal number");
        Scanner scanner = new Scanner(System.in);
        double speed = 0;
        try {
            speed = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            //           throw new Exception
            System.out.println("Please enter a decimal number");
            //oferim posibilitatea userului de a incerca din noi; apelam iar metoda readaccelerationspeed
            return readAccelerationSpeed();
        }
        System.out.println("You accelerated with " + speed + " km/h");
        return speed;
    }

    private void addCompetitor() {
        //apelez metoda creata anterior
        String vehicleName = readVehicleName();
        Vehicle vehicle = new Vehicle();
        vehicle.setName(vehicleName);
        vehicle.setMileage(ThreadLocalRandom.current().nextDouble(8,20));
        System.out.println("your vehicle's mileage is: "+vehicle.getMileage());
        competitors.add(vehicle);
    }

    private void addAllCompetitors() {
        for (int i = 0; i < competitorCount; i++) {
            addCompetitor();
        }
    }


    public void start() throws Exception {
        addAllCompetitors();

    boolean noWinnerYet= true;

    while(noWinnerYet) {

        for (Vehicle vehicle : competitors) {
        double speed = readAccelerationSpeed();

        vehicle.accelerate(speed);

        if (vehicle.getTravelDistance()>= track.getLenght()){
            System.out.println("the winner is :"+ vehicle.getName());
            noWinnerYet= false;


        }

    }

    }


    }


    //private Vehicle[] competitors = new Vehicle[10];

    //public void start() {
    // Engine engine = new Engine();
    //engine.setManufacturer("Volvo");
    //Vehicle firstCompetitor = createCompetitor(engine, "Volvo", "red", 40, 8.5, 4);
    // Engine secondengine = new Engine();
    // secondengine.setManufacturer("Toyota");
//        Vehicle secondCompetitor = createCompetitor(engine, "Toyota", "black", 40, 10.5, 4);
//        competitors[0] = firstCompetitor;
//        competitors[1] = secondCompetitor;
//
//        System.out.println(competitors[0].getName());
//        // citirea metodei
//        System.out.println(competitors[1].getName());
//
//        for (int i = 0; i < competitors.length; i++) {
//            System.out.println(competitors[i].getName());
//            {
//
//            }
//            if (competitors[i] != null){
//                System.out.println(competitors[i].getName());
//            }
//
//        }
//        // enhanced for
//        for(Vehicle vehicle : competitors){
//            if (vehicle !=null){
//                System.out.println(vehicle.getName());
//            }
//        }
//    }
//
//
//    // parameters contain car prefix just to demo they can have any name
//    private Car createCompetitor(Engine carEngine, String carName, String carColor, double carFuelLevel, double carMileage, int carDoorCount) {
//        Car competitor = new Car(carEngine);
//        competitor.setName(carName);
//        competitor.setColor(carColor);
//        competitor.setFuelLevel(carFuelLevel);
//        competitor.setDoorCount(carDoorCount);
//
//        return competitor;
//    }
//
//
//    public Track getTrack() {
//        return track;
//    }

    public void setTrack(Track track) {
        this.track = track;
    }
}



