package ua.levelup.mikhailaleksandr_homework5;
import java.util.Scanner;
import java.lang.String;


public class MikhailaleksandrHomework5 {
    public static void main(String[] args) {
        System.out.println("Please choose from the following menu options...\n\t1. Edit user data\n\t2. Calculate matrices\n\t3. Send emails with results\ntype q for exit");

        Scanner in = new Scanner(System.in);
        String s = new String();
        do {
            s = in.nextLine();
            if (s.equals("1")) {
                System.out.println("was chosen menu 1");
                break;
            } else if (s.equals("2")) {
                System.out.println("was chosen menu 2");
                break;
            } else if (s.equals("3")) {
                System.out.println("was chosen menu 3");
                break;
            } else if (s.equals("q")) {
                break;
            } else if (s.length() > 1) {
                System.out.println("Please enter only one symbol!");
            } else if (s != "1" || s != "2" || s != "3" || s != "q") {
                System.out.println("Please enter valid entry!");
            }
        }
        while (!s.equals("q"));
    }
}
