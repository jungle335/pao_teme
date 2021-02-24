package com.company;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(1 > 0) {
            System.out.println("!!!Numerele n, a, b sunt citite de la tastatura!!!");
            System.out.println("Alege 1 pentru a afisa numerele pare din [0,n].");
            System.out.println("Alege 2 pentru a afisa cel mai mare numar dintre a si b.");
            System.out.println("Alege 3 pentru a calcula factorialul unui numar n.");
            System.out.println("Alege 4 pentru a afisa suma multiplilor de 3 si 5 pana la n (inclusiv).");
            System.out.println("Alege 5 pentru a citi n numere. Acestea vor fi puse in doi vectori, in functie de paritate.");
            System.out.println("Alege 6 pentru a citi n note. Se afiseaza media lor.");
            System.out.println("Alege 7 pentru a afisa al n-lea termen din seria Fibonacci.");
            System.out.println("Alege 8 pentru iesire!");
            System.out.println("Optiunea dumneavoastra : ");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    int n = sc.nextInt();
                    for (int i = 0; i <= n; i++)
                        if (i % 2 == 0)
                            System.out.print(i + " ");
                    System.out.println();
                    break;

                case 2:
                    int a = sc.nextInt(), b = sc.nextInt();

                    if (a < b)
                        System.out.println(b);
                    else
                        System.out.println(a);
                    break;

                case 3:
                    int p = 1, nr = sc.nextInt();

                    while (nr > 0) {
                        p *= nr;
                        nr -= 1;
                    }
                    System.out.println(p);
                    break;

                case 4:
                    int s = 0, nn = sc.nextInt();

                    for (int i = 0; i <= nn; i++)
                        if (i % 3 == 0 || i % 5 == 0)
                            s += i;
                    System.out.println(s);
                    break;

                case 5:
                    int nrN = sc.nextInt(), i = 0, j = 0;
                    int[] par = new int[nrN], imp = new int[nrN];

                    for (int k = 0; k < nrN; k++) {
                        int x = sc.nextInt();
                        if (x % 2 == 0) {
                            par[i++] = x;
                            continue;
                        }
                        imp[j++] = x;
                    }
                    System.out.println(Arrays.toString(Arrays.stream(par).filter(x -> x > 0).toArray()));
                    System.out.println(Arrays.toString(Arrays.stream(imp).filter(x -> x > 0).toArray()));
                    break;

                case 6:
                    int x, k = 0, nnote = sc.nextInt();
                    int[] note = new int[nnote];
                    do {
                        note[k++] = sc.nextInt();;
                    } while (k < nnote);
                    System.out.println("Pentru a calcula media, introduceti -1");

                    if(sc.nextInt() == -1)
                        System.out.println(Arrays.stream(note).sum() / (float) k);
                    else
                        System.out.println("Valoare incorecta!");
                    break;

                case 7:
                    int fibN = sc.nextInt(), fst = 0, snd = 1, summ = 0;

                    for(int count = 2; count <= fibN; count++)
                    {
                        summ = fst + snd;
                        fst = snd;
                        snd = summ;
                    }
                    System.out.println(summ);
                    break;

                case 8 : return;
            }
        }
    }
}
