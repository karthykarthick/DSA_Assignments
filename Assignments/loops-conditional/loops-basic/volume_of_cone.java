package loops;

import java.util.Scanner;

public class volume_of_cone {
    public static void main(String[] args) {
//        formula is V=πr2(h/3)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an radius: ");
        int radius = input.nextInt();
        System.out.println("Enter an Height: ");
        int height = input.nextInt();

        double pi = 3.14;
        double volume = pi * radius * radius * height / 3;
        System.out.println(volume);

    }
}
