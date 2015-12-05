package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        System.out.println("Prosze podac liczbę");
        Scanner Kw = new Scanner(System.in);
        n = Kw.nextInt();
        Kw.close();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        // write your code here
    }
}
