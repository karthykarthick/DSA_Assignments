package functions;

public class triplets_pythogorean {
    public static void main(String[] args) {
        int ar[] = {3,1,4,6,5};
        int arr_size = ar.length;
        System.out.println(triplet(ar, arr_size));

    }
    static boolean triplet(int[] ar, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <n; j++) {
                for (int k = j+1; k < n; k++) {
                    int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];
                    if (x == y + z || y == x + z || z == x + y) {
                     return  true;
                    }
                }
            }

        }
        return false;
    }
}
