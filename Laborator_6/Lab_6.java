package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Lab_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User:");
        String user = sc.next();
        System.out.println("Parola:");
        String parola = sc.next();
        Map<String, String> useri = new HashMap<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader("src/parole.txt"));
            String row;
            while ((row = br.readLine()) != null){
                String[] data = row.split(" ");
                useri.put(data[0], data[1]);
                if (Objects.equals(user, data[0])){
                    if (Objects.equals(parola, data[1])) {
                        System.out.println("Acces permis");
                        return;
                    }
                    throw new Exception("Parola gresita!!!");
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            if (Objects.equals(e.getMessage(), "Parola gresita!!!")){
                int incercari = 3;
                System.out.println("Numar de incercari: " + incercari);
                while (incercari > 0){
                    parola = sc.next();
                    incercari--;
                    if(Objects.equals(useri.get(user), parola)){
                        System.out.println("Acces permis");
                        return;
                    }
                    System.out.println("Numar de incercari: " + incercari);
                }
                System.out.println("Cont blocat!!!");
            }
        }
    }
}
