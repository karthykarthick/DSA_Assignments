package loops;

import java.util.Scanner;

public class Perimeter_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Base value: ");
        int base = input.nextInt();
        
        System.out.println("Enter Sides value: ");
        int sides = input.nextInt();

        int perimeter = 2 * (base + sides);
        System.out.println(perimeter);
    }
}
