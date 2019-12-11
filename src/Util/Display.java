/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Scanner;

/**
 *
 * @author Johann Lee Jia Xuan This class is used to display menus
 */
public class Display {

    // Display simple menu with built-in exception detection
    public static int showMenuChoice(String title, String[] choices) {
        boolean error = false;
        int choice = 0;

        do {
            System.out.println("========================================");

            System.out.println(title);
            System.out.println("========================================\n");

            for (int i = 0; i < choices.length; i++) {
                System.out.println(i + 1 + ". " + choices[i] + "\n");
            }

            System.out.println("========================================\n");
            // Show an error, if an error was made on previous loop
            if (error) {
                System.out.println("Error: Select between options 1 to " + choices.length + " only.\n");
            }
            choice = promptInt("Please select an option");
            clear();

            // Checks for whether user selects an option outside of the number of choices
            if (choice < 1 || choice > choices.length + 1) {
                error = true;
            } else {
                error = false;
            }

        } while (error);

        return choice;
    }

    // Following classes are to simplify input code
    public static int inputInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static String inputString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static float inputFloat() {
        Scanner scan = new Scanner(System.in);
        return scan.nextFloat();
    }

    public static int promptInt(String message) {
        System.out.print(message + ": ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static String promptString(String message) {
        System.out.print(message + ": ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static double promptDouble(String message) {
        System.out.print(message + ": ");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static float promptFloat(String message) {
        System.out.print(message + ": ");
        Scanner scan = new Scanner(System.in);
        return scan.nextFloat();
    }

    // Spams newlines to simulate screen refresh
    public static void clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }
}
