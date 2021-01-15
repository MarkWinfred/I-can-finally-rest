import java.util.Scanner;


/**
 * The code is for a simple converter.
 * Converting measuring units from metric to imperial and vice-versa
 * @author Mark Winfred A. Turco
 */

public class Main {

    public static void main(String[] args){
        Scanner option = new Scanner(System.in);

        System.out.println("Welcome to the measurement converter! Choose one of the options!");
        System.out.println("[1] Temperature [2] Solid Ingredients [3] Liquid Ingredients");

        String choice = option.nextLine();
        int choice_int = Integer.parseInt(choice);

        switch (choice_int) {
            case 1 -> temperature.welcome();
            case 2 -> solid.welcome();
            case 3 -> liquid.welcome();
            default -> {
                System.out.println("Choose only one of the corresponding numbered options.");
                main(null);
            }
        }

    }
}
