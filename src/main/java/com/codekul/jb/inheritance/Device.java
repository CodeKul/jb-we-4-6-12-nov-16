package com.codekul.jb.inheritance;

/**
 * Created by aniruddha on 19/11/16.
 */
public class Device {

    private String manufacturer;
    private Long id;
    protected int power;

    public String getManufacturer() {
        return manufacturer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void life() {

    }
}
