public class august_problem {
    public static void main(String[] args) {
        int aug = 31; int sum = 0;
        for (int i = 1; i <= aug ; i++) {
            if(i % 2 == 0){
                sum++;
            }
        }
        System.out.println("you can be allowed for "+ sum + " these days");
    }
}
