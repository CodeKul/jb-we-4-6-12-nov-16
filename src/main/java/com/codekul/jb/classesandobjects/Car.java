package com.codekul.jb.classesandobjects;

/**
 * Created by aniruddha on 19/11/16.
 */
public class Car {

    private String name;
    private int wheels; // state -> field -> properties

    public Car() { // default
        name = "Bmw";
        wheels = 4;
    }

    public Car(String nm, int wheels) { //paramatrized
        name = nm;
        this.wheels = wheels;
    }

    public Car(Car car){
        this.name = car.name;
        this.wheels = car.wheels;
    }

    public void whatsName() { // behaviour -> methods -> functions
        System.out.println("Name is " + name); // string + any = string
    }

    public void speed()  {
        wheels++;
        //f(x) = x++
        System.out.println("Speed is " + wheels);
    }

    public void speed(int factor) {
        wheels = wheels++ * factor;
        System.out.println("Speed is " + wheels);
    }
}
