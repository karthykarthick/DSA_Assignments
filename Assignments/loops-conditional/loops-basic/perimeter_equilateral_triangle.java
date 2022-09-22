package loops;

import java.util.Scanner;

public class perimeter_equilateral_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Sides: ");
        int sides = input.nextInt();
        int perimeter = 3 * sides;
        System.out.println(perimeter);
    }
}
