package functions;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num_one = input.nextInt();
        int num_two = input.nextInt();
        int ans = mul(num_one,num_two);
        System.out.println("The product of two numbers is: "+ ans);

    }

     static int mul(int num_one, int num_two) {
        int num = num_one * num_two;
        return num;
    }
}
