package functions;

import java.util.Scanner;

public class area_circumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = input.nextInt();
       double ans = rad(radius);
        System.out.println("The value of circumference is: "+ ans);
    }

    static float rad(int radius) {
        double pi = 3.14;
        double ra = 2 * pi * radius;
        return (float) ra;
    }
}
