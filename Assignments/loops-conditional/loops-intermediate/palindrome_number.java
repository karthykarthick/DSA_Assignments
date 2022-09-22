package intermediate_loops;

import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;
        int rev = 0;
        while (num > 0){
            int last_digit = num % 10;
            rev = (rev * 10 + last_digit);
            num = num / 10;
        }

        if (temp == rev){
            System.out.println("palindrome number");
        }else{
            System.out.println("Not a palindrome number");
        }
    }
}
