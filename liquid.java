import java.util.Scanner;

public class liquid {
    public static void welcome(){
        Scanner option = new Scanner(System.in);

        String cup = " Cup/s";
        String L = " Liter/s";
        String ml = " Milliliter/s";

        System.out.println("Welcome to the Solid Ingredients converter! Choose one of the options!");
        System.out.println("[1] Cups | [2] Liters | [3] Milliliters:");

        String choice1 = option.nextLine();
        int int1 = Integer.parseInt(choice1);

        System.out.println("Kindly input your value: ");
        String value1 = option.nextLine();
        int int2 = Integer.parseInt(value1);

        System.out.println("Choose the option you want to convert your value to!");
        System.out.println("[1] Cups | [2] Liters | [3] Milliliters:");

        String choice2 = option.nextLine();
        int int3 = Integer.parseInt(choice2);


        double answer = converterliquid.convert(int1,int2,int3);
        if(int3 == 1){
            System.out.println("Your answer is: "+answer+cup);
        }else if(int3 == 2){
            System.out.println("Your answer is: "+answer+L);
        }else {
            System.out.println("Your answer is: "+answer+ml);
        }
    }
}
