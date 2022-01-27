package com.company;

//Difference Of Squares :easy
//Find the difference between the square of the sum and the sum of the squares of the first N natural numbers.

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for n: ");
        n = sc.nextInt();
        Diff d = new Diff();

        System.out.println(d.Square_Diff(n));
    }
}


class Diff {
    public int Square_Diff(int n){

        int l, k, m;
        // Sum of the squares of the
        l = (n * (n + 1) * (2 * n + 1)) / 6;

        k = (n * (n + 1)) / 2;
        k = k * k;
        m = (k - l);

        return m;

    }
}