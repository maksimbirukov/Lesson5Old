package ua.levelup.homework;

import java.util.Scanner;
    public class MyHomeworkForLesson5 {
        public static void main(String[] args) throws java.io.IOException {

            Scanner scanner = new Scanner(System.in);

            System.out.println(" Please choose from the following menu option...\n" +
                    "  1. Edit user data \n" +
                    "  2. Calculate matrices \n" +
                    "  3. Send email with results \n" +
                    "type q for exit");

            String option = scanner.next();
            while (option.length() !=1){
                System.out.println("Please enter only one symbol!");
                option = scanner.next();
            }
            switch (option) {
                case "1":
                    System.out.println("was chosen menu 1");
                    break;
                case "2":
                    System.out.println("was chosen menu 2");
                    break;
                case "3":
                    System.out.println("was chosen menu 3");
                    break;
                case "Q":
                    System.out.println("exit");
                case "q":
                    System.out.println("exit");
                default:
                    System.out.println("Please enter valid entry!");
                    option = scanner.next();
                    break;

            }
        }
    }