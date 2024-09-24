package com.imaks;

import java.util.Scanner;

public class Main {
    // 1 mile = 1.60934 km
    private static final double CONV_M = 1.60934;

    public static void main(String[] args) {
        System.out.println("Distance Converter");
        System.out.println("V 1.0");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("Enter 1 to convert miles to kilometers");
            System.out.println("Enter 0 to exit");
            int choice = scanner.nextInt();

            if (choice == 0){
                System.out.println("Byeee!!!");
                break;
            }

            System.out.println("Enter your number:");
            double number = scanner.nextDouble();

            if (number == 0 || number < 0) {
                System.out.println("Number must be more than 0. Try again.");
                continue;
            }

            switch (choice) {
                case 1:
                    double km = milesToKm(number);
                    System.out.println(number + " miles = " + km + " km");
                    break;
                default:
                    System.out.println("Please, enter 1 to convert or 0 to exit");
            }
        }
        scanner.close();

    }
    private static double milesToKm(double miles){
        return miles * CONV_M;
    }

}