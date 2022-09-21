package loops;

import java.util.Scanner;

public class numbers_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        int product = 1;
        while(num > 0){
            sum = sum + num;
            product = product * num;
            num = input.nextInt();
            if(num == '0'){
                break;
            }
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
