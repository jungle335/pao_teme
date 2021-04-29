package com.company.Laborator_4;

public class OutTask implements Task{
    private String mesaj;

    public OutTask(String mesaj){
        this.mesaj = mesaj;
    }

    @Override
    public void execute() {
        System.out.println(mesaj);
    }
}
