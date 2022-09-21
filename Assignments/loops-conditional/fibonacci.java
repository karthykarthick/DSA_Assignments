package loops;

public class fibonacci {
    public static void main(String[] args) {
        int num_one = 0;
        int num_two = 1;
        int num_three;
        int num = 10;

        System.out.println(num_one);
        System.out.println(num_two);

        for (int i = 0; i <= num; i++) {
            num_three = num_one + num_two;
            System.out.println(num_three);

            num_one = num_two;
            num_two = num_three;
        }

    }
}
