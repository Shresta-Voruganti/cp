import java.util.*;

public class ap26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] customers = new int[n];
        for(int i = 0; i < n; i++) {
            customers[i] = sc.nextInt();
        }
        int[] grumpy = new int[n];
        for(int i = 0; i < n; i++) {
            grumpy[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(bookstore(n, customers, grumpy, k));
        sc.close();
    }

    public static int bookstore(int n, int[] customers, int[] grumpy, int k) {
        int satisfied = 0;
        int extrasatisfied = 0;
        int maxsatisfied = 0;

        for(int i = 0; i < n; i++) {
            if(grumpy[i] == 0) {
                satisfied += customers[i];
            }
        }

        for(int i = 0; i < n; i++) {
            if(grumpy[i] == 1) {
                extrasatisfied += customers[i];
            }

            if(i >= k && grumpy[i - k] == 1) {
                extrasatisfied -= customers[i - k];
            }

            maxsatisfied = Math.max(maxsatisfied, extrasatisfied);
        }

        return satisfied + maxsatisfied;
    }
}
