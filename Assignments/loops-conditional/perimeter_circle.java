package loops;

import java.util.Scanner;

public class perimeter_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of an circle: ");
        int radius = input.nextInt();
        double pi = 3.14;
        double perimeter = 2 * pi * radius;
        System.out.println(perimeter);
    }
}
