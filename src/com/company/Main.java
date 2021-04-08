package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner((System.in));
        Random rand = new Random();

        int randomNumber = rand.nextInt(101);
        int inputNumber = 0;

        String[] playerNames = new String[2];

        for (int i = 0; i < playerNames.length; i++) {
            System.out.println("Enter name of player " + (i + 1));
            playerNames[i] = s.nextLine();
        }

        do {
            for (int i = 0; i < playerNames.length; i++) {
                System.out.println(playerNames[i] + "Enter Number");
                inputNumber = s.nextInt();

                if (inputNumber < randomNumber)
                    System.out.println("The ndfsumdber is higher");
                else if (inputNumber > randomNumber)
                    System.out.println("The number is lower");
                else {
                    System.out.println("correct");
                    break;
                }
            }
        } while (inputNumber != randomNumber);
    }
}
