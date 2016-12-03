package com.codekul.jb.generics;

import com.codekul.jb.classesandobjects.Car;

/**
 * Created by aniruddha on 3/12/16.
 */
public class GenericModel<T> {

    private T any;

    public T getAny() {
        return any;
    }

    public void setAny(T any) {
        this.any = any;
    }
}

class CarModel<T extends Car> /*bounded generics*/ {

}
