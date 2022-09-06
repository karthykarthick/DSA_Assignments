import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {

        //Question:
        // Write a program to print whether a number is even or odd, also take input from the user.

        //Solution:

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number to Find Odd or Not");
        int a = input.nextInt();

        if(a % 2 == 0){
            System.out.println(a + " is a Even Number");
        }else {
            System.out.println(a + " is a Odd Number");
        }

    }
}
