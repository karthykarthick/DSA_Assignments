import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if( (year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) {
            System.out.println("Leap year");
        }else {
            System.out.println("Not an leap year");
        }
    }
}
