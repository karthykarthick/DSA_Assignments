package loops;

public class product {
    public static void main(String[] args) {
        int n = 234;
        int val = 1;
        int sum = 0;
        while(n > 0){
            int last_digit = n % 10;
            sum = last_digit + sum;
            val = last_digit * val;
            n = n / 10;

        }
        int res = val - sum;
        System.out.println(res);
    }
}
