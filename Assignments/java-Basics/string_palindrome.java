import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String app = input.nextLine();
        int count = 0;


        for (int i = 0; i < app.length()/2; i++) {
            if (app.charAt(i) == app.charAt(app.length()-i-1)){
               count ++;
            }
        }
        if (app.length()/2 == count){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}

