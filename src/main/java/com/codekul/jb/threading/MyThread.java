package com.codekul.jb.threading;

/**
 * Created by aniruddha on 3/12/16.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();

        for(int i = 0 ; i < 100 ; i++) {
            System.out.println("My Thread - "+i);
        }
    }
}
