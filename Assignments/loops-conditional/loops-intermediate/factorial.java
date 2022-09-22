package intermediate_loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial for it: ");
        int num = input.nextInt();
        int product = 1;
        for (int i = num; i >= 1 ; i--) {
            product = product * i;
        }
        System.out.println(product);
    }
}
