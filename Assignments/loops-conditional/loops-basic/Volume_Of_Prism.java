package loops;

import java.util.Scanner;

public class Volume_Of_Prism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an area: ");
        int area = input.nextInt();
        System.out.println("Enter an Length: ");
        int length = input.nextInt();

        int volume_prism = area * length;
        System.out.println(volume_prism);
    }
}
