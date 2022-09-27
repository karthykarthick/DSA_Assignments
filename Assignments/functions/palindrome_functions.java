package functions;

import java.util.Scanner;

public class palindrome_functions {
    static int rem;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(palindrome(num));
    }

    private static boolean palindrome(int num) {
        int temp = num;
        while (num > 1){
            int last_digit = num % 10;
            rem = rem * 10 + last_digit;
            num = num / 10;
        }
        if(rem == temp){
            return true;
        }else return false;
    }
}
