package com.company;

public class Area {
    Object[] cutii;
    private int number;
    private String street;

    public Area(){
        cutii = new Object[]{new Merci(), new Lindt(), new Milka()};
        this.number = 0;
        this.street = "";
    }

    public Area(int number, String street, Object ... m){
        cutii = new Object[m.length];
        for(int i = 0; i < m.length; i++){
            cutii[i] = m[i];
        }
        this.number = number;
        this.street = street;
    }

    public void printAddress(){
        System.out.println("Adresa este: " + street);
        for(Object o : cutii){
            System.out.println(o);
        }
    }
}
