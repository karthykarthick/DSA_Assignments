package loops;

import java.util.Scanner;

public class volume_pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your length: ");
        int length = input.nextInt();

        System.out.println("Enter your width: ");
        int width = input.nextInt();

        System.out.println("Enter your height: ");
        int height = input.nextInt();

        int volume = (length * width * height) / 3;
        System.out.println(volume);
    }
}
