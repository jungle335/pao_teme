package com.company.Laborator_4;

import java.util.Comparator;
import java.util.Objects;

public class Album implements Comparable<Album>{
    String nume, artist;
    int rating, anulPublicarii;

    public Album(){
        this.nume = this.artist = "";
        this.rating = this.anulPublicarii = 0;
    }

    public Album(String nume, String artist, int rating, int anulPublicarii){
        this.nume = nume;
        this.artist = artist;
        this.rating = rating;
        this.anulPublicarii = anulPublicarii;
    }

    @Override
    public int compareTo(Album o) {
        return this.rating - o.rating;
    }

    @Override
    public String toString() {
        return "{ Nume: " + nume + " ,Artist: " + artist + " , Rating: " + rating + " ,An: " + anulPublicarii + " }";
    }
}

class comparaNume implements Comparator<Album>{
    @Override
    public int compare(Album o1, Album o2) {
        if (Objects.equals(o1.nume, o2.nume)){
            return 0;
        }
        return o1.nume.compareToIgnoreCase(o2.nume);
    }
}

class comparaAnulPublicarii implements Comparator<Album>{
    @Override
    public int compare(Album o1, Album o2) {
        return o1.anulPublicarii - o2.anulPublicarii;
    }
}
