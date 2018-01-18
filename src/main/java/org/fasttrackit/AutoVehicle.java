package org.fasttrackit;

public class AutoVehicle  extends Vehicle{

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public AutoVehicle (Engine engine ){
       this. engine= engine;

    }





    public AutoVehicle(){
        this(new Engine());
    }
}
