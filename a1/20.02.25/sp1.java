import java.util.*;

public class sp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for(int i = 0; i < n + 1; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(countt(n, arr)));
        sc.close();
    }

    public static int[] countt(int n, int[] arr) {
        int[] res = new int[n + 1];
        for(int i = 0; i < n + 1; i++) {
            res[i] = bitcount(arr[i]);
        }

        return res;
    }

    public static int bitcount(int ele) {
        int count = 0;
        while(ele > 0) {
            if((ele & 1) == 1) {
                count++;
            }
            ele = ele >> 1;
        }

        return count;
    }
}
