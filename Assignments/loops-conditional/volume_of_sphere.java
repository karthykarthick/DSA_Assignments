package loops;

import java.util.Scanner;

public class volume_of_sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for radius: ");
        int radius = input.nextInt();
        double pi = 3.14;
        double volume = 1.33 * pi * radius * radius * radius;
        System.out.println(volume);

    }
}
