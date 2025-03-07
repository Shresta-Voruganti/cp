import java.util.*;

public class ap27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(impbor(nums));
        sc.close();
    }

    public static int impbor(int[] nums) {
        Set<Integer> s1 = new HashSet<>();

        for(int num : nums) {
            s1.add(num);
        }

        int power = 1;
        while(s1.contains(power)) {
            power = power << 1;
            //left shift operator - gets multiplied by 2
            //similar to `power = power * 2`
        }

        return power;
    }
}
