package com.company;

class General <T> {
    public void afis(T[] arr){
        for(T a : arr){
            System.out.println(a);
        }
    }
}

public class Lab_5 {
    public static void main(String[] args) {
        General <Integer> i = new General<>();
        General <String> s = new General<>();
        Integer[] intA = {1, 2, 3, 4, 5};
        String[] strA = {"hello", "world"};
        i.afis(intA);
        s.afis(strA);

    }
}
