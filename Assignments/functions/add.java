package functions;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num_one = input.nextInt();
        int num_two = input.nextInt();
       int ans =  addtion(num_one,num_two);
        System.out.println("the value is: "+ans);
    }

     static int addtion(int num_one, int num_two) {
        return num_one + num_two;
    }

}
