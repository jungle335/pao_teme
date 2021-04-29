package com.company;

import java.io.FileWriter;
import java.util.Objects;
import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x:");
        int x = sc.nextInt();
        System.out.println("y:");
        int y = sc.nextInt();

        try{
            if (x >= y){
                throw new Exception("Primul numar trebuie sa fie mai mic decat al doilea!!!");
            }
            FileWriter fw = new FileWriter("src/perechi.txt", true);
            fw.append("(" + x + ", " + y + ")\n");
            fw.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            if (Objects.equals(e.getMessage(), "Primul numar trebuie sa fie mai mic decat al doilea!!!")){
                System.out.println("x:");
                x = sc.nextInt();
                System.out.println("y:");
                y = sc.nextInt();
                while (x < y){
                    try{
                        System.out.println("x:");
                        x = sc.nextInt();
                        System.out.println("y:");
                        y = sc.nextInt();
                        FileWriter fw = new FileWriter("src/perechi.txt", true);
                        fw.append("(" + x + ", " + y + ")\n");
                        fw.close();
                    } catch (Exception exp){
                        System.out.println(exp.getMessage());
                    }
                }
            }
        }

    }
}
