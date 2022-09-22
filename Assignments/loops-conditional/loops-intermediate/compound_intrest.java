package intermediate_loops;

import java.util.Scanner;

public class compound_intrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your principal amount");
        int principal = input.nextInt();
        System.out.println("Enter your Rate of intrest: ");
        double rate = input.nextDouble();
        System.out.println("Enter your Time span : ");
        int time = input.nextInt();

        double compund_intrest = principal * Math.pow((1 + rate/100), time);
        System.out.println(compund_intrest);
    }
}
