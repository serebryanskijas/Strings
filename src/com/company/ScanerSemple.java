package com.company;

import java.util.Scanner;

public class ScanerSemple {
    public static void main(String[] args) {
        /*
      What is your name? - Hello, name!
      How old are you? - You are 30 years old.
      What is your favorite food? - Your favorite food is food.
      Enter your height. - You are 170 cm tall.
       */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.printf("Hello %s!%n",name);

        System.out.println("How old are you??");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("You are %d!%n",age);


        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        System.out.printf("Your favorite food is %s!%n",food);

        System.out.println("Enter your height.");
        double height = scanner.nextDouble();
        System.out.printf("You are %f cm tall. ",height);
    }
}
