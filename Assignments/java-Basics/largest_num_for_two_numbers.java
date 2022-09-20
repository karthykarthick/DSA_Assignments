import java.util.Scanner;

public class largest_num_for_two_numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Number: ");
        int num_one = input.nextInt();
        System.out.println("Enter an Number: ");
        int num_two = input.nextInt();

        if(num_one > num_two){
            System.out.println( num_one + " is greater Number");
        }else {
            System.out.println(num_two + " is greater Number");
        }
    }
}
