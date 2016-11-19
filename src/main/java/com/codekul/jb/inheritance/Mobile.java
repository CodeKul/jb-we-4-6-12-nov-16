package com.codekul.jb.inheritance;

/**
 * Created by aniruddha on 19/11/16.
 */
public class Mobile /*is a device*/ extends Device {

    private int battery;

    public Mobile() {

        setId(100l);
        power = 45;
    }

    public void chargeIt(){
        power ++ ;
    }

    @Override
    public void life() {
        super.life();

        battery = 0;
    }
}
