import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
       while (num > 0){
            int last_digit = num % 10;
            sum = sum + last_digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
