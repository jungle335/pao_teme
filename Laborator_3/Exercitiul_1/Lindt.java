package com.company;

public class Lindt extends CandyBox {
    private double width, height, length;

    public Lindt(){
        this.width = this.height = this.length = 0;
    }

    public Lindt(String flavour, String origin, int width, int height, int length){
        super(flavour, origin);
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getVolume(){
        return this.width * this.height * this.length;
    }

    @Override
    public String toString() {
        return super.toString() + " has volume " + getVolume();
    }
}
