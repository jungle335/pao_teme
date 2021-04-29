package com.company;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sir = in.next();
        int i = 0, j = sir.length() - 1;

        while (i < sir.length() && j > 0){
            if (sir.charAt(i) != sir.charAt(j)){
                System.out.println("Sirul " + sir + " nu este palindrom");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Sirul " + sir + " este palindrom");
    }


}
