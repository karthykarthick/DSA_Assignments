import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Principal Amount: ");
        int principal = input.nextInt();

        System.out.println("Enter your Intrest Rate: ");
        float intrest_rate = input.nextFloat();

        System.out.println("Enter an Amount of years: ");
        int years = input.nextInt();

        float simple_intrest = principal * intrest_rate * years;

        System.out.println("your simple intrest is " + simple_intrest);
    }
}
