import java.util.*;

public class ap24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] times = new int[n];
        for(int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(trips(n, times, k));
        sc.close();
    }

    public static int trips(int n, int[] times, int k) {
        int sum = 0;
        int t = 0;
        while(sum < k) {
            t++;
            sum = 0;
            for(int i = 0; i < n; i++) {
                sum += t/times[i];
            }
        }

        return t;
    }
}
