package intermediate_loops;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num_one = input.nextInt();
        System.out.println("Enter your Number: ");
        int num_two = input.nextInt();
        int hcf = 0;

        for (int i = 1; i <= num_one || i <= num_two ; i++) {
            if(num_one % i == 0 && num_two % i == 0){
                hcf = i;
            }

        }
        System.out.println("The hcf is: "+ hcf);

    }
}
