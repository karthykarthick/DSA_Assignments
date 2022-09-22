package intermediate_loops;

import java.util.Scanner;

public class str_rev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Original word: "+ str);
        char ch;
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev = ch+rev;
        }
        System.out.println("reversed word: "+rev);
    }
}
