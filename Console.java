package ua.levelup.homework.savchenkodmitriy;
import java.util.Scanner;
public class Console {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose from the following menu options:" +
                "\n  1. Edit user data" +
                "\n  2. Calculate matrices" +
                "\n  3. Send email with results" +
                "\ntype q for exit");
        do {
            String st = scan.nextLine();
            try {
                int input = Integer.parseInt(st);
                if (input == 1 || input == 2 || input == 3) {
                    System.out.println("Was chosen menu " + input);
                    break;
                } else if (st.length() > 1) {
                    System.out.println("Please enter only one symbol!");
                } else {
                    System.out.println("Please enter the valid entry!");
                }
            } catch (NumberFormatException ex) {
                if (st.equalsIgnoreCase("q")) {
                    System.out.println("Exit");
                    break;
                } else {
                    System.out.println("Please enter the valid entry!");
                }
            }
        }
        while (true);
    }
}






