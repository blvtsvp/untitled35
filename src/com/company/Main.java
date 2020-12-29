package com.company;

import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(gcd(a,b) == 1) System.out.println("числа взаимно простые");
        else System.out.println("числа не взаимно простые");
    }
}
