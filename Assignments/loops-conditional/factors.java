package loops;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find a factors: ");
        int num = input.nextInt();

        for (int i = 1; i <= num ; i++) {
            if(num % i == 0){
                System.out.println("The factors are: "+i);
            }
        }
    }
}
