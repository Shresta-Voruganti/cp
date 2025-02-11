import java.util.*;

public class ap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(flexiblewindow(arr, n, k));
        sc.close();
    }

    public static int flexiblewindow(int[] arr, int n, int k) {
        int sum = 0;
        int left = 0;
        int maxlen = 0;
        for(int right = 0; right < n; right++) {
            sum += arr[right];

            while(sum > k) {
                sum -= arr[left];
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }
}
