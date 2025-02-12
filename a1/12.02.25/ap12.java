import java.util.*;

public class ap12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Arrays.toString(rotateArray(arr, n, k)));
        sc.close();
    }

    public static int[] rotateArray(int[] arr, int n, int k) {
        k = k % n;
        if(n == 1) {
            return arr;
        }

        if(k == 0) {
            return arr;
        }
        reverseOrder(arr, 0, n);
        reverseOrder(arr, 0, k);
        reverseOrder(arr, k, n);

        return arr;
    }

    public static int[] reverseOrder(int[] arr, int start, int end) {
        int left = start, right = end - 1;
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }

}
