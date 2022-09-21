import java.util.Scanner;

public class Amstrong_number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int cube = 0;
        int temp = num;
        while(temp > 0){
            int last_digit = temp % 10;
            cube = cube + (last_digit * last_digit *last_digit);
            temp = temp / 10;
        }
        if(cube == num){
            System.out.println("Amstrong number");
        }else {
            System.out.println("Not an Amstrong number");
        }
    }
}
