package com.company.Laborator_4;

import java.util.Arrays;

public class Main {
    public static void afis(Album[] albume){
        for(Album a : albume){
            System.out.println(a);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        OutTask o = new OutTask("Mesaj");
        RandomTask rt = new RandomTask();
        CounterOutTask cot = new CounterOutTask();

        o.execute();
        rt.execute();
        cot.execute();

        System.out.println();

        Album[] albume = new Album[]{new Album("Who made who", "ACDC", 5, 1986),
                                     new Album("Black Ice", "ACDC", 4, 2008),
                                     new Album("Spiritus Sanctus", "Cargo", 4, 2003),
                                     new Album("Europe", "Europe", 3, 1983)};

        System.out.println("Inainte de sortare");
        afis(albume);
        System.out.println("Sortare dupa rating:");
        Arrays.sort(albume);
        afis(albume);
        System.out.println();
        System.out.println("Inainte de sortare");
        afis(albume);
        System.out.println("Sortare dupa numele albumului:");
        Arrays.sort(albume, new comparaNume());
        afis(albume);
        System.out.println();
        System.out.println("Inainte de sortare");
        afis(albume);
        System.out.println("Sortare dupa anul publicarii:");
        Arrays.sort(albume, new comparaAnulPublicarii());
        afis(albume);

        Operation num = new Operation();
        num.plus(10);
        num.minus(20);
        num.mult(11);
        num.div(2);
        System.out.println(num);
    }
}
