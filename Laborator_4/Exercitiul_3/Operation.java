package com.company.Laborator_4;

interface Plus{
    public void plus(float num);
}

interface Minus{
    public void minus(float num);
}

interface Mult{
    public void mult(float num);
}

interface Div{
    public void div(float num);
}

public class Operation implements Plus, Minus, Mult, Div{
    private float numar;

    Operation(){
        this.numar = 0;
    }

    public void plus(float num){
        this.numar += num;
    }

    public void minus(float num){
        this.numar -= num;
    }

    public void mult(float num){
        this.numar *= num;
    }

    public void div(float num){
        this.numar /= num;
    }

    @Override
    public String toString() {
        return String.valueOf(numar);
    }
}
