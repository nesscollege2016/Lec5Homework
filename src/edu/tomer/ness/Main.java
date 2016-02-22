package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x:");
        int x = scan.nextInt();
        int mult = 1;

        System.out.println("Enter y:");
        int y = scan.nextInt();

        for (int i = 0; i < y ; i++) {
            mult = mult * x;
        }
        System.out.println(mult);


    }


}

