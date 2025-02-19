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
        int dup = 0;
        boolean fo = true;
        boolean so = false;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > n || nums[i] < 1) {
                dup = -1;
                return dup;
            }
            if(!fo) {
                so = true;
                dup = nums[i];
            }
            fo = false;
            if(nums[i] > n || nums[i] < 1) {
                dup = -1;
                return dup;
            }
        }

        return (so == true) ? dup : -1;
    }
}
