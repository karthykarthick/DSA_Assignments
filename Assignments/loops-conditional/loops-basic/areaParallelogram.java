package loops;

import java.util.Scanner;

public class areaParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Base value: ");
        int base = input.nextInt();
        System.out.println("Enter your height value: ");
        int height = input.nextInt();

        int area_parallelogram = base * height;
        System.out.println(area_parallelogram);
    }
}
