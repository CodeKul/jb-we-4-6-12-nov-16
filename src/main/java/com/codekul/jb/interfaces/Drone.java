package com.codekul.jb.interfaces;

/**
 * Created by aniruddha on 26/11/16.
 */
public class Drone implements GpsListener{

    public void fly(){

    }

    public int getBatteryLevel(){
        return 50;
    }

    @Override
    public void locate() {
        System.out.println("In City");
    }
}
