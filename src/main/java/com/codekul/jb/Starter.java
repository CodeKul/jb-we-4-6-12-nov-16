package com.codekul.jb;

import com.codekul.jb.abstractclasses.Animal;
import com.codekul.jb.abstractclasses.Tiger;
import com.codekul.jb.classesandobjects.Car;
import com.codekul.jb.exception.Physics;
import com.codekul.jb.generics.GenericModel;
import com.codekul.jb.inheritance.Device;
import com.codekul.jb.inheritance.Mobile;
import com.codekul.jb.innerclass.InnerInterface;
import com.codekul.jb.innerclass.MyInnerInterface;
import com.codekul.jb.innerclass.Outer;
import com.codekul.jb.interfaces.Drone;
import com.codekul.jb.threading.MyThread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

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

    public void abstractClasses() {

        Animal animal = new Tiger();
        animal.walk();

        Tiger tiger = new Tiger();
        tiger.walk();
    }

    public void interfaces() {

        Drone drone = new Drone();
        drone.fly();
        drone.getBatteryLevel();
        drone.locate();
    }

    public void innerClasses() {

        Outer outer = new Outer();

        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.staticInnerMethod();

        Outer.PublicInner publicInner = outer.new PublicInner();
        publicInner.accessOuter();

        outer.outerMethod();

        //InnerInterface ii = /*obejct of that class which is implementing InnerInterface*/

        //anonymous inner classes
        InnerInterface ii1 = new MyInnerInterface();
        InnerInterface ii = new InnerInterface() {
            @Override
            public void innerData() {

            }
        };
        ii.innerData();

        //beginning of functional programming
        InnerInterface ii3  = () -> {}; //lambda expression ,
        InnerInterface ii4 = outer::outerMethod; // method reference
    }

    public void exceptionHandling() /*throws Exception*/{

        Physics physics = new Physics();
        physics.calcAcceleration(100,89);
        physics.calcAcceleration(80,100);
        physics.calcAcceleration(85,0);
        physics.calcAcceleration(85,-90);
        physics.calcAcceleration(85,852);

        try {
            physics.calcAcceleration(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void threading(){
        MyThread threadOne = new MyThread();
        threadOne.start();

        Thread threadRunnable = new Thread(this::myRun);
        threadRunnable.start();
    }

    private void myRun() {
        for (int i = 0 ; i < 100 ; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MyRun "+i);
        }
    }

    public void generics() {

        GenericModel<String> stringModel = new GenericModel<>();
        stringModel.setAny("android");
        System.out.println("This time any - "+stringModel.getAny());

        GenericModel<Integer> intModel = new GenericModel<>();
        intModel.setAny(100);
        System.out.println("This time any - "+intModel.getAny());

        GenericModel<Car> carModel = new GenericModel<>();
        carModel.setAny(new Car());
        System.out.println("This time any - "+carModel.getAny());
    }

    public void collections() {

        Collection<String> collection = new ArrayList<>();
        collection.add("Android");
        collection.add("Apple");
        collection.add("Rim");
        collection.add("Symbian");
        collection.add("Bada");
        collection.add("PlamOs");
        collection.add("Mango");

        for(String str : collection)  System.out.println("ForOf - "+str);

        Iterator<String> itStr = collection.iterator();
        while(itStr.hasNext()){
            String str = itStr.next();
            System.out.println("Iterator -"+str);
        }

        collection.forEach(s -> System.out.println("Lambda - "+s));
        collection.forEach(System.out::println);
    }
}
