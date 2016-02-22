package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        System.out.println("Enter from:");
        int from = scan.nextInt();

        System.out.println("Enter to:");
        int to = scan.nextInt();
*/


        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a number to test:");
        int currentNumber = scan.nextInt();

        if (currentNumber < 2){
            System.out.println(currentNumber + " not primary");
        }else if(currentNumber == 2){
            System.out.println(currentNumber + " Primary");
        }else if(currentNumber %2 == 0){
            System.out.println(currentNumber + " Not primary");
        }

        else{
            boolean isPrimary = true;

            for (int i = 3; i < currentNumber / 2; i+=2) {
                if (currentNumber % i == 0){
                    isPrimary = false;
                    break;
                }
            }

            if (isPrimary)
                System.out.println("Primary " + currentNumber);
            else
                System.out.println(currentNumber + " Not primary");
        }
    }
}
