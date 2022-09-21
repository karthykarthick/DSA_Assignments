package loops;

import java.util.Scanner;

public class area_isosceles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Base value: ");
        int base = input.nextInt();
        System.out.println("Enter your Height value: ");
        int height = input.nextInt();

        double area_isosceles = (base * height) / 2;
        System.out.println(area_isosceles);
    }
}
