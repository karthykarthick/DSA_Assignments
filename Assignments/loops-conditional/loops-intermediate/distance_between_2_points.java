package intermediate_loops;

import java.util.Scanner;

public class distance_between_2_points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for x1: ");
        int x1 = input.nextInt();
        System.out.println("Enter the value for y1: ");
        int y1 = input.nextInt();
        System.out.println("Enter the value for x2: ");
        int x2 = input.nextInt();
        System.out.println("Enter the value for y2: ");
        int y2 = input.nextInt();

        double distance = Math.sqrt((x2 - x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Distance between two points: " + distance);

    }
}
