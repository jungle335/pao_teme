package com.company.Laborator_4;

public class CounterOutTask implements Task{
    private static int count = 0;

    @Override
    public void execute() {
        System.out.println(count++);
    }
}
