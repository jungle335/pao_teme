package com.company;

public class Merci extends CandyBox{
    private double length;

    public Merci(){
        super();
        length = 0;
    }

    public Merci(String flavour, String origin, int length){
        super(flavour, origin);
        this.length = length;
    }

    public double getVolume(){
        return Math.pow(this.length, 3);
    }

    @Override
    public String toString() {
        return super.toString() + " has volume " + getVolume();
    }
}
