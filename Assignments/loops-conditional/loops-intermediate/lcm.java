package intermediate_loops;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num_one = input.nextInt();
        System.out.println("Enter your Number: ");
        int num_two = input.nextInt();
        int lcm = 0;

        for (int i = 1; i <= num_one && i <= num_two ; i++) {
            if(num_one % i == 0 && num_two % i == 0){
                lcm = i;
            }
        }
        System.out.println(lcm);
        System.out.println("The lcm is: "+ (num_one*num_two)/lcm);

    }
}
