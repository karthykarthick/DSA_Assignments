package loops;

import java.util.Scanner;

public class rohmbus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for P: ");
        int p = input.nextInt();
        System.out.println("Enter the value for Q: ");
        int q = input.nextInt();

        int area = (p * q )/ 2;
        System.out.println(area);

    }
}
