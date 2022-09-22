package loops;

import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius to calculate the Area of Circle");
        int radius = input.nextInt();

        double pi = 3.14;
        // formula
        double area_circle = pi * radius * radius;
        System.out.println(area_circle);
    }
}
