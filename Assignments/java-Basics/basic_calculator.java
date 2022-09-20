import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Number: ");
        int num_one = input.nextInt();
        System.out.println("Enter an Number: ");
        int num_two = input.nextInt();
        System.out.println("Enter an symbol to perform an operation: +,-,*,/");
        String operation = input.next();

        if (operation.charAt(0) == '+'){
            int num_three = num_one + num_two;
            System.out.println("The Added value is: " + num_three);
        }

        if (operation.charAt(0) == '-'){
            int num_three = num_one - num_two;
            System.out.println("The Subracted value is: " + num_three);
        }

        if(operation.charAt(0) == '*'){
            int num_three = num_one * num_two;
            System.out.println("The Multiplied value is: "+ num_three);
        }

        if(operation.charAt(0) == '/'){
            int num_three = num_one / num_two;
            System.out.println("The divided value is: "+ num_three);
        }
    }
}
