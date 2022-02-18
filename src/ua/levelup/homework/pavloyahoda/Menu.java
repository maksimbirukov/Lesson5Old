package ua.levelup.homework.pavloyahoda;

import java.util.Scanner;

//
public class Menu {
    public static void main(String[] args) {

        System.out.printf("Please chose from the following menu options...%n" +
                "1. Edit user data%n" +
                "2. Calculate matrices%n" +
                "3. Send email with results%n" +
                "Type q for exit%n");

        boolean userInput = true;
        while(userInput){
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();

            switch(choice) {
                case "1":
                    System.out.println("Was chosen menu 1");
                    break;
                case "2":
                    System.out.println("Was chosen menu 2");
                    break;
                case "3":
                    System.out.println("Was chosen menu 3");
                    break;
                case "q":
                case "Q":
                    System.out.println("Good bay!");
                    userInput = false;
                    break;
                default:
                    if (choice.length() > 1){
                        System.out.println("Please enter only one symbol!");
                    } else {
                        System.out.println("Please enter valid entry!");
                    }
            }
        }
    }
}
