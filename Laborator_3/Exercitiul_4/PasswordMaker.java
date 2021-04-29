package com.company;

import java.util.Random;

public class PasswordMaker {
    private final int MAGIC_NUMBER = 20;
    private StringBuilder MAGIC_STRING;
    private static PasswordMaker psmaker = null;
    String name;

    PasswordMaker(String name){
        this.MAGIC_STRING = genString(MAGIC_NUMBER);
        this.name = name;
    }

    public String getPassword(){
        return genString(MAGIC_NUMBER).toString() + MAGIC_STRING.substring(0, 10) + name.length() + new Random().nextInt(101);
    }

    public StringBuilder genString(int dimensiune){
        if (dimensiune < 20){
            return null;
        }
        Random rand = new Random();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < dimensiune; i++){
            int randNum = rand.nextInt('z' - 'a') + 'a';
            str.append((char) randNum);
        }
        return str;
    }

    public static PasswordMaker just(String name){
        if (psmaker == null){
            psmaker = new PasswordMaker(name);
        }
        return psmaker;
    }
}
