package functions;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        System.out.println("Enter a number to check it is prime or not: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }

     static boolean isPrime(int num) {
        int count = 0;
         for (int i = 2; i < num ; i++) {
             if (num % i == 0){
                 count++;
             }
         }
         if (count > 0) {
             return false;
         }else {
             return true;
         }
    }
}
