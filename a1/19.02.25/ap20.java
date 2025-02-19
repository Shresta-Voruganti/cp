import java.util.*;

public class ap20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Arrays.toString(decode(n, arr, k)));
        sc.close();
    }

    public static int[] decode(int n, int[] arr, int k) {
        int[] res = new int[n];

        if(k == 0) {
            Arrays.fill(res, 0);
            return res;
        }

        for(int i = 0; i < n; i++) {
            if(k > 0) {
                res[i] = sumup(n, k, i, arr);
            }
            else {
                res[i] = sumdown(n, k, i, arr);
            }
        }

        return res;
    }

    public static int sumup(int n, int k, int index, int[] arr) {
        int sum = 0;
        int count = 0;
        int kin = index;
        for(int i = 0; i < Math.abs(k); i++) {
            if(count > k) {
                break;
            }
            kin = (kin + 1) % n;
            sum += arr[kin];
            count++;
        }
        return sum;
    }

    public static int sumdown(int n, int k, int index, int[] arr) {
        int sum  = 0;
        int count = 0;
        int kin = index;
        for(int i = 0; i < Math.abs(k); i++) {
            if(count > Math.abs(k)) {
                break;
            }
            kin = (kin - 1 + n) % n;
            sum += arr[kin];
            count++;
        }
        return sum;
    }
}
