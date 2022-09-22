package intermediate_loops;

import java.util.Scanner;

public class sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many numbers that you need to sum it: ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
           sum = sum + input.nextInt();
        }
        System.out.println("The sum of n numbers is:  "+sum);
    }
}
