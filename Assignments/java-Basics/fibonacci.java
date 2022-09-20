import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number: ");
        long num = input.nextLong();
        long num_one = 0;
        long num_two = 1;

        System.out.println(num_one);
        System.out.println(num_two);
        for (int i = 0; i < num; i++) {
            long num_3 = num_one + num_two;
            System.out.println(num_3);
            num_one = num_two;
            num_two = num_3;
        }
    }
}
