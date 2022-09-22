package intermediate_loops;

import java.util.Scanner;

public class amstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int temp = num;
        int ams = 0;
        while(temp > 0){
            int last_digit = temp % 10;
            ams = ams + (last_digit * last_digit * last_digit);
            temp = temp / 10;
        }
        if (ams == num){
            System.out.println("Amstrong number");
        }else {
            System.out.println("It is not an Amstrong number");
        }
    }
}
