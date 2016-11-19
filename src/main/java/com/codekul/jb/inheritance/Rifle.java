package com.codekul.jb.inheritance;

/**
 * Created by aniruddha on 19/11/16.
 */
public class Rifle extends Device {

    private int spring;
    private int tenency;

    public void fire(){

    }

    @Override
    public void life() {
        //super.life();

        spring = 0;
    }
}
