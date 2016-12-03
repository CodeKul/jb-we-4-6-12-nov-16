package com.codekul.jb.exception;

/**
 * Created by aniruddha on 3/12/16.
 */
public class Physics {

    // f = ma
    public void calcAcceleration(int force,int mass) {

        if(mass == 0) throw new BadMassException();
        int acc = 0;
        try {
            acc = force/ mass; // throw new RuntimeException();
        }
        catch (BadMassException e){
            e.printStackTrace();
        }
        catch (RuntimeException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Acceleration is "+acc);
    }

    public void calcAcceleration(int mass) throws Exception{
        if(mass == 0) throw new BadMassException();
        int acc = 0, force = 500;
        acc = force/ mass; // throw new RuntimeException();

        System.out.println("Acceleration is "+acc);
    }
}
