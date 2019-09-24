package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        int rev = 0;
        int d;

        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number");

n=obj.nextInt();


        while (n>0)
        {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;

        }
        System.out.println("reverse number is:"+ rev);

    }
}
