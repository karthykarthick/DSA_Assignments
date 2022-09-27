package functions;

import java.util.Scanner;

public class sum_of_natural_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(sum(num));
    }

     static int sum(int num) {
        int sum = 0;
         for (int i = 1; i <= num; i++) {
             sum = sum + i;
         }
         return sum;
     }

}
