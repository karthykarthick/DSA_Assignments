import java.util.Scanner;

public class inr_to_Usd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("");
        float rupees = input.nextFloat();

        double usd = rupees / 79.73;
        System.out.println("Usd is "+ usd);

    }
}
