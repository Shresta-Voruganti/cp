import java.util.*;

public class ap17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(threesum(n, arr, target));
        sc.close();
    }

    public static int threesum(int n, int[] arr, int target) {
        // int sum  = 0;
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        int sum1 = 0;
        for(int i = 0; i < n - 2; i++) {
            int newtarget = target - arr[i];
            int val = closestpair(arr, newtarget, i + 1, n - 1);
            int sum = arr[i] + val;
            int diff = Math.abs(sum - target);
            if(diff < mindiff) {
                mindiff = diff;
                // sum1 = arr[i] + val;
                sum1 = sum;
            }
        }
        return sum1;
    }


    public static int closestpair(int[] arr, int target, int left, int right) {
        // int sum1 = 0;
        int sum1 = arr[left] + arr[right];
        // int left = 0;
        // int right = arr.length - 1;
        // int sum = 0;
        // int mindiff = Integer.MAX_VALUE;
        int mindiff = Math.abs(sum1 - target);
        // while(left < arr.length && right >= 0) 
        while(left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - target);

            if(diff < mindiff) {
                mindiff = diff;
                // sum1 = arr[left] + arr[right];
                sum1 = sum;
            }

            if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return sum1;
    }
}
