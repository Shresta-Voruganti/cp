import java.util.*;

public class ap11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(twosum(n, arr, target));
        sc.close();
    }

    public static List<Integer> twosum(int n, int[] arr, int target) {
        int left = 0;
        int right = n - 1;
        int sum = 0;
        while(left <= right) {
            sum = arr[left] + arr[right];
            if(sum == target) {
                return Arrays.asList(left + 1, right + 1);
            }
            else if(sum < target) {
                left++;
            }
            else
            {
                right--;
            }
        }

        return new ArrayList<Integer>();
    }

}
