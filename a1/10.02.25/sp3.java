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
        System.out.println(kthsum(arr, k));
        sc.close();
    }

    public static int kthsum(int[] arr, int k) {
        int min = Integer.MAX_VALUE; int sum = 0;
        for(int num : arr) {
            min = Math.min(min, num);
            sum += num;
        }
        int low = min; int high = sum;
        while(low < high) {
            int mid = low + (high - low)/2;
            int count = countSubarray(arr, mid);
            if(count < k) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }

    public static int countSubarray(int[] arr, int mid) {
        int count = 0;
        int sum = 0;
        int left = 0; int right = 0;
        int n = arr.length;
        while(right < n) {
            sum += arr[right];
            if(sum > mid) {
                sum -= arr[left];
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }
}
