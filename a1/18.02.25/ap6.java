import java.util.*;

public class ap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n + 1];
        for(int i = 0; i < n + 1; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(removeOneDup(n, nums));
        sc.close();
    }

    public static int removeOneDup(int n, int[] nums) {
        int dup = -1;
        if(n < 1) {
            return -1;
        }

        int xorNums = 0;
        int xorAll = 0;
        // contains elements 1 to n (inclusive) => 1 <= nums[i] <= n

        for(int num : nums) {
            if(num > n || num < 1) {
                return -1;
            }
            xorNums = xorNums ^ num;
        }

        for(int i = 1; i <= n; i++) {
            xorAll = xorAll ^ i;
        }

        dup = xorNums ^ xorAll;

        return dup;
    }
}
