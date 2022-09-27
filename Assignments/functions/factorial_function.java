package functions;

import java.util.Scanner;

public class factorial_function {
    int fact = 1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(fact(num));
    }

     static int fact(int num) {
        int fact= 1;
         for (int i = num; i >= 1; i--) {
             fact = fact * i;
         }
         return  fact;
    }
}
