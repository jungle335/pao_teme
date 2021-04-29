package com.company.Laborator_4;

import java.util.Random;

public class RandomTask implements Task{
    private int nr;

    public RandomTask(){
        this.nr = new Random().nextInt();
    }

    @Override
    public void execute() {
        System.out.println(nr);
    }
}
