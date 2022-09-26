package functions;

import java.util.Scanner;

public class vote_eligblity_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = input.nextInt();
        System.out.println("The result is: "+ check(age));
    }

     static boolean check(int age) {
        if (age >= 18) {
            return true;
        }else return false;
     }
}
