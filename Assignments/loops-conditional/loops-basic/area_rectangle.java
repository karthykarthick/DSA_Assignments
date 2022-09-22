package loops;

import java.util.Scanner;

public class area_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Width: ");
        int width = input.nextInt();
        System.out.println("Enter your Height: ");
        int height = input.nextInt();

        int area_Triangle = width * height;
        System.out.println(area_Triangle);
    }
}
