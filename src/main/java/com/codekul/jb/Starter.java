package com.codekul.jb;

import com.codekul.jb.classesandobjects.Car;
import com.codekul.jb.inheritance.Device;
import com.codekul.jb.inheritance.Mobile;

import java.util.Date;

/**
 * Created by aniruddha on 19/11/16.
 */
public class Starter {

    public void classesAndObjects() {

        Car car = new Car();
        car.speed();
        car.speed(50);

        Car carAudi = new Car("Audi A7",10);
        Car carBmw = new Car(carAudi);

        Date date = new Date();

        String str = new String();
    }

    public void inheritance() {

        Device device = new Device();
        device.setId(100l);

        Mobile mobile = new Mobile();
        mobile.getManufacturer();
        mobile.chargeIt();

         Device deviceMobile = new Mobile();

         //Mobile mobileDevice = new Device();
    }

    public void abstractClasses(){
    }

    public void interfaces() {
    }

    public void innerClasses() {
    }

    public void exceptionHandling() {
    }

    public void threading(){
    }

    public void generics() {
    }

    public void collections() {
    }
}
