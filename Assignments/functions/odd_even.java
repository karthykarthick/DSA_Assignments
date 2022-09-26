package functions;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number to find it is odd or even: ");
        int num = input.nextInt();
        System.out.println(odd_or_even(num));
    }

     static boolean odd_or_even(int a) {
        if (a % 2 == 0){
            return true;
        }else return  false;
    }
}
