import java.util.*;

public class sp5 {
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
        int target = sc.nextInt();
        int[] res = closestpair(a1, a2, n1, n2, target);
        System.out.println(res[0]+","+res[1]);
        sc.close();
    }

    public static int[] closestpair(int[] a1, int[] a2, int n1, int n2, int target) {
        // if(n1 == 0 || n2 == 0) {
        //     return new int[]{-1, -1};
        // }
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
