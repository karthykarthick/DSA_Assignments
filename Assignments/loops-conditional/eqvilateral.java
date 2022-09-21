package loops;

import java.util.Scanner;

public class eqvilateral {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Sides: ");

        int side = input.nextInt();
        double area =(1.732/4)* side * side;
        System.out.println(area);
    }
}
