package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter from:");
        int from = scan.nextInt();

        System.out.println("Enter to:");
        int to = scan.nextInt();


        if (from <= 2){
            from = 3;
            System.out.print(2 + ", ");
        }else if (from %2 == 0) {
            from += 1;
        }

        //from izugi
        //3, 5, 7, 9
        for (int currentNumber = from; currentNumber < to; currentNumber+=2) {
                boolean isPrimary = true;
                for (int i = 3; i < currentNumber / 2; i += 2) {
                    if (currentNumber % i == 0) {
                        isPrimary = false;
                        break;
                    }
                }
                if (isPrimary)
                    System.out.print(currentNumber + ", ");
            }
        }






    }

