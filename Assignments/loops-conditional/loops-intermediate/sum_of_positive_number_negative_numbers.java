import java.util.Scanner;

public class sum_of_positive_number_negative_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nsum = 0;
        int esum = 0;
        int osum = 0;
        System.out.println("Enter the numbers");
        while(true){
            int num = input.nextInt();
            if(num == 0){
                break;
            }
            if(num < 0){
                nsum = nsum + num;
            } else if (num % 2 == 0) {
                esum = esum + num;
            }else {
                osum = osum + num;
            }
        }
        System.out.println("Negative number sum: "+ nsum);
        System.out.println("positive Even sum: "+ esum);
        System.out.println("Positve Odd sum: "+ osum);
    }
}
