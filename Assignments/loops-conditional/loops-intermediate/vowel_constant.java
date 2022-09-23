package intermediate_loops;

import java.util.Scanner;

public class vowel_constant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }else {
            System.out.println("Constant");
        }
    }
}
