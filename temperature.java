import java.util.Scanner;

public class temperature {
    public static void welcome(){
        Scanner option = new Scanner(System.in);

        String cel1 = " Celsius";
        String fah2 = " Fahrenheit";
        String kel3 = " Kelvin";

        System.out.println("Welcome to the temperature converter! Choose one of the options!");
        System.out.println("[1] Celsius | [2] Fahrenheit | [3] Kelvin: ");

        String choice1 = option.nextLine();
        int int1 = Integer.parseInt(choice1);

        System.out.println("Kindly input your value: ");
        String value1 = option.nextLine();
        int int2 = Integer.parseInt(value1);

        System.out.println("Choose the option you want to convert your value to!");
        System.out.println("[1] Celsius | [2] Fahrenheit | [3] Kelvin: ");

        String choice2 = option.nextLine();
        int int3 = Integer.parseInt(choice2);


        double answer = convertertemp.convert(int1,int2,int3);
        if(int3 == 1){
            System.out.println("Your answer is: "+answer+cel1);
        }else if(int3 == 2){
            System.out.println("Your answer is: "+answer+fah2);
        }else {
            System.out.println("Your answer is: "+answer+kel3);
        }
    }
}
