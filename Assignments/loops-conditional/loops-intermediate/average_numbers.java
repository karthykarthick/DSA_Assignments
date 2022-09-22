package intermediate_loops;

import java.util.Scanner;

public class average_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        double sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + input.nextInt();
        }
        System.out.println("Average is:  "+sum/num);
    }
}
