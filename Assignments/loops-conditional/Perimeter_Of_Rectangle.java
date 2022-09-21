package loops;

import java.util.Scanner;

public class Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        //P=2(l+w)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length value: ");
        int length = input.nextInt();
        System.out.println("Enter the width value: ");
        int width = input.nextInt();

        int perimeter = 2 * (length + width);
        System.out.println(perimeter);
    }
}
