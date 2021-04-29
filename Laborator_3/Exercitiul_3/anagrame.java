package com.company;

import java.util.Scanner;

public class anagrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] fr1 = new int[26], fr2 = new int[26];
        String s = sc.next(), t = sc.next();

        if (s.length() != t.length()){
            System.out.println("Cuvintele " + s + " si " + t + " nu sunt anagrame");
            System.exit(0);
        }

        for(int i = 0; i < s.length(); i++){
            fr1[s.charAt(i) - 'a'] += 1;
            fr2[t.charAt(i) - 'a'] += 1;
        }

        for(int i = 0; i < 26; i++){
            if (fr1[i] != fr2[i]){
                System.out.println("Cuvintele " + s + " si " + t + " nu sunt anagrame");
                System.exit(0);
            }
        }

        System.out.println("Cuvintele " + s + " si " + t + " sunt anagrame");
    }
}
