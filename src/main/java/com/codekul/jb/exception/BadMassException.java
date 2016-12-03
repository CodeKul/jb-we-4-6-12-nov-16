package com.codekul.jb.exception;

/**
 * Created by aniruddha on 3/12/16.
 */
public class BadMassException extends RuntimeException {

    @Override
    public String getMessage() {
        return "I am trying to divide force by zero mass";
    }

    @Override
    public String toString() {
        return "Provided mass is zero";
    }
}
