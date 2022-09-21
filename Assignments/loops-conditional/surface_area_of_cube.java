package loops;

import java.util.Scanner;

public class surface_area_of_cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the area: ");
        int area = input.nextInt();

        int suraface = 6 * area * area;
        System.out.println(suraface);
    }
}
