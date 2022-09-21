package loops;

import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Base value: ");
        int base = input.nextInt();

        System.out.println("Enter height value: ");
        int height = input.nextInt();

        double area_triangle = 0.5 * base * height;
        System.out.println(area_triangle);
    }
}
