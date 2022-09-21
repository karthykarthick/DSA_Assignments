package loops;

import java.util.Scanner;

public class volume_of_cylinder {
    public static void main(String[] args) {
        //V=πr2h
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Radius: ");
        int radius = input.nextInt();

        System.out.println("Enter the height: ");
        int height = input.nextInt();

        double pi = 3.14;
        double volume = pi * radius * radius * height;
        System.out.println(volume);
    }
}
