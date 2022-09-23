package intermediate_loops;

import java.util.Scanner;

public class future_investment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal Amount: ");
        int principal = input.nextInt();
        System.out.println("Enter the intrest rate: ");
        double intrest_rate = input.nextDouble();
        System.out.println("Enter the time period: ");
        int time = input.nextInt();

        double future_investment = principal * Math.pow(1 + intrest_rate/100, time);
        System.out.println("your future investment value is: "+ future_investment);

    }
}
