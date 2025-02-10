import java.util.*;

public class sp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(kthsum(arr, n, k));
        sc.close();
    }

    public static int kthsum(int[] arr, int n, int k) {
        int numsets = (int) Math.pow(2, n);
        if(k > numsets) {
            return 0;
        }
        if(k <= n) {
            return arr[k - 1];
        }
        int sum  = 0;
        int wsize = (k / n) + 1;
        int start = (k % n) - 1;
        for(int i = start; i < wsize; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
