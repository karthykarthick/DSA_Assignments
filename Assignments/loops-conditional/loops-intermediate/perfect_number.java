import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;
        int sum = 0;

        for (int i = 1; i < num ; i++) {
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if (sum == temp){
            System.out.println("perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
}
