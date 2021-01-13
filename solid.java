import java.util.Scanner;

public class solid{


    public static void welcome(){
        Scanner option = new Scanner(System.in);

        String cup = " Cups";
        String kg = " Kilograms";
        String g = " Grams";

        System.out.println("Welcome to the Solid Ingredients converter! Choose one of the options!");
        System.out.println("[1] Cups | [2] Kilograms | [3] Grams: ");

        String choice1 = option.nextLine();
        int int1 = Integer.parseInt(choice1);

        System.out.println("Kindly input your value: ");
        String value1 = option.nextLine();
        int int2 = Integer.parseInt(value1);

        System.out.println("Choose the option you want to convert your value to!");
        System.out.println("[1] Cups | [2] Kilograms | [3] Grams:");

        String choice2 = option.nextLine();
        int int3 = Integer.parseInt(choice2);


        double answer = convertersolid.convert(int1,int2,int3);
        if(int3 == 1){
            System.out.println("Your answer is: "+answer+cup);
        }else if(int3 == 2){
            System.out.println("Your answer is: "+answer+kg);
        }else {
            System.out.println("Your answer is: "+answer+g);
        }
    }
}
