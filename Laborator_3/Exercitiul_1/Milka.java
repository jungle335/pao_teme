package com.company;

public class Milka extends CandyBox{
    private double radius, height;

    public Milka(){
        radius = height = 0;
    }

    public Milka(String flavour, String origin, int radius, int height){
        super(flavour, origin);
        this.radius = radius;
        this.height = height;
    }

    public double getVolume(){
        return this.radius * this.radius * this.height * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + " has volume " + getVolume();
    }
}
