import java.util.*;

public class ap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxsum(n, arr));
        sc.close();
    }

    public static int maxsum(int n, int[] arr) {
        if(n == 1) {
            return 0;
        }

        int sum = 0;
        int currprod = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            currprod += (i * arr[i]);
        }

        int maxprod = currprod;
        for(int i = 1; i < n; i++) {
//            currprod = currprod + sum - arr[n - i] - (n - 1) * arr[n - i];
            currprod = currprod + sum - n * arr[n - i];
            maxprod = Math.max(maxprod, currprod);
        }

        return maxprod;
    }

//    public static int maxsum(int n, int[] arr) {
//        if(n == 1) {
//            return 0;
//        }
//
//        int k = 0;
//        int prod = 0;
//        int maxprod = 0;
//        for(int i = 0; i < n; i++) {
//            reverse(arr, 0, n - 1);
//            reverse(arr, 0, k - 1);
//            reverse(arr, k, n - 1);
//            prod = mul(n, arr);
//            maxprod = Math.max(prod, maxprod);
//            k++;
//        }
//
//        return maxprod;
//    }
//
//    public static void reverse(int[] arr, int start, int end) {
//        while(start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
//
//    public static int mul(int n, int[] arr) {
//        int prod = 0;
//
//        for(int i = 0; i < n; i++) {
//            prod += (i * arr[i]);
//        }
//
//        return prod;
//    }
}
