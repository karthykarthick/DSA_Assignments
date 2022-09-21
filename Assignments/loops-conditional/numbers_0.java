package loops;

import java.util.Scanner;

public class numbers_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int max = 0;

        while(num > 0){
            max = Math.max(max,num);
            num = input.nextInt();
            if(num == '0'){
                break;
            }
        }
        System.out.println(max);
    }
}
