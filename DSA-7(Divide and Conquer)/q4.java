import java.util.Arrays;

public class q4 {
    public static void check(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b); // Removed Collections.reverseOrder(), as it's not applicable for primitive arrays
        int k = 10;

        for (int i = 0; i < a.length; i++) {
            if (a[i] + b[b.length - i - 1] < k) { // Corrected accessing the elements of array b
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int[] b = {9, 7, 9};
        check(a, b);
    }
}
