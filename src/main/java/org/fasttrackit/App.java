package org.fasttrackit;


public class App {
    public static void main( String[] args ) throws Exception {
        Race race = new Race();
        Track track = new Track();
        track.setLenght(100);
        race.setTrack(track);

//test comm

        race.start();
        }



    }

