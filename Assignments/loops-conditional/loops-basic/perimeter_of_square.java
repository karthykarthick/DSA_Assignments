package loops;

import java.util.Scanner;

public class perimeter_of_square {
    public static void main(String[] args) {
        //formula -> P=4a
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your side: ");
        int side = input.nextInt();
        int perimeter = 4 * side;
        System.out.println(perimeter);
    }
}
