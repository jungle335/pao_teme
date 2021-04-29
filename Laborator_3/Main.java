package com.company;

import com.company.Area;
import com.company.Lindt;
import com.company.Milka;
import com.company.Merci;
import com.company.PasswordMaker;


public class Main {

    public static void main(String[] args) {
        Area a = new Area(10, "Str", new Merci("coffee", "Germany", 10),
                                                  new Lindt("strawberries", "Switzerland", 20, 10, 5),
                                                  new Milka("chocolate", "Czech Republic", 2, 4));
        a.printAddress();

        System.out.println();
        PasswordMaker ps = PasswordMaker.just("Jungle");
        System.out.println(ps.getPassword());
    }
}
