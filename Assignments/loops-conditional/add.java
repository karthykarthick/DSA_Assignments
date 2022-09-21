package loops;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num_one = input.nextInt();
        System.out.println("Enter your second number: ");
        int num_two = input.nextInt();
        int num_three = num_one + num_two;
        System.out.println("The addition value is: "+num_three);

    }
}
