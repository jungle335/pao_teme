package com.company;

import java.util.Objects;

public abstract class CandyBox {
    private String flavor, origin;

    public CandyBox(){
        this.flavor = this.origin = "";
    }

    public CandyBox(String flavor, String origin){
        this.flavor = flavor;
        this.origin = origin;
    }

    abstract public double getVolume();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CandyBox)) {
            return false;
        }
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(flavor, candyBox.flavor) && Objects.equals(origin, candyBox.origin)
                && getVolume() == candyBox.getVolume();
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, origin);
    }

    @Override
    public String toString() {
        return "The " + origin + " " + flavor;
    }
}
