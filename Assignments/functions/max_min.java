package functions;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(min_max(a,b,c));
    }

     static int min_max(int num_one,int num_two,int num_three) {
        if (num_one > num_two && num_one > num_three){
            return num_one;
        } else if (num_two > num_one && num_two > num_three) {
            return  num_two;
        }else {
            return  num_three;
        }
     }

}
