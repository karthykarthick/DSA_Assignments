package loops;

import java.util.Scanner;

public class CSA_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Enter the value for radius: ");
        int radius = input.nextInt();

        System.out.println("Enter the value for height: ");
        int height = input.nextInt();

        double csa = 2 * pi * radius * height;
        System.out.println(csa);

    }
}
