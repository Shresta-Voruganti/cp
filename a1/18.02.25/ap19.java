import java.util.*;

public class ap19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        int n3 = sc.nextInt();
        int[] a3 = new int[n3];
        for(int i = 0; i < n3; i++) {
            a3[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(closestTriplet(n1, n2, n3, a1, a2, a3, target)));
        sc.close();
    }

    public static int[] closestTriplet(int n1, int n2, int n3, int[] a1, int[] a2, int[] a3, int target) {
        int sum = 0;
        int[] res = new int[3];
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < n1; i++) {
            int newtarget = target - a1[i];
            int[] val = closestpair(a2, a3, n2, n3, newtarget);
            sum = a1[i] + val[0] + val[1];
            int diff = Math.abs(sum - target);
            if(diff < minDiff) {
                minDiff = diff;
                res[0] = a1[i];
                res[1] = val[0];
                res[2] = val[1];
            }
        }
        return res;
    }

    public static int[] closestpair(int[] a1, int[] a2, int n1, int n2, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = n2 - 1;
        int sum = 0;
        int mindiff = Integer.MAX_VALUE;
        while(left < n1 && right >= 0) {
            sum = a1[left] + a2[right];
            int diff = Math.abs(sum - target);

            if(diff < mindiff) {
                mindiff = diff;
                res[0] = a1[left];
                res[1] = a2[right];
            }

            if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return res;
    }
}
