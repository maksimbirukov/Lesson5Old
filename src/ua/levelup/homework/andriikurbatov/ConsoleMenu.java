package ua.levelup.homework.andriikurbatov;

import java.util.Scanner;

public class ConsoleMenu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose from the following menu options:" +
                "\n    1. Edit user data" +
                "\n    2. Calculate matrices" +
                "\n    3. Send email with results" +
                "\ntype q for exit");

        boolean check = false;

        while(true) {
            String str = scan.nextLine();
            int value;
            try{
                value = Integer.parseInt(str);
                if (value == 1 || value == 2 || value == 3){
                    break;
                } else {
                    System.out.println("Please enter the valid entry");
                }

            } catch (NumberFormatException ex){
                if (str.length() > 1){
                    System.out.println("Please enter only one symbol!");
                } else if (str.equals("q")){
                    break;
                } else{
                    System.out.println("Please enter the valid entry!");
                }
            }
        }
    }


}
